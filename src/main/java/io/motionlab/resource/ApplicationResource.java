package io.motionlab.resource;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.BeanInject;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import io.motionlab.model.CustomerInfo;
import io.motionlab.model.EquityBankBillRequest;
import io.motionlab.model.EquityBankBillResponse;
import io.motionlab.model.EquityBankPaymentRequest;
import io.motionlab.model.EquityBankPaymentResponse;
import io.motionlab.model.MPESABillRequest;
import io.motionlab.model.MPESABillResponse;
import io.motionlab.model.Order;
import io.motionlab.model.OutMessage;
import io.motionlab.model.Transaction;
import io.motionlab.service.OrderService;
import io.motionlab.service.OutMessageService;
import io.motionlab.service.TransactionService;
import io.motionlab.processor.MPESABillManagerValidateProcessor;
import io.motionlab.processor.OrderProcessor;

@Component
public class ApplicationResource extends RouteBuilder {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private OutMessageService outMessageService;
	
	@BeanInject
	private OrderProcessor orderProcessor;
	
	@BeanInject
	private MPESABillManagerValidateProcessor processor;
	
	
	@Value("${cpf_mpension.validation.url}")
	private String validationURL;
	
	@Override
	public void configure() throws Exception {
		
		 restConfiguration()
		      .component("servlet")
		      .host("localhost")
		      .port(9090)
		      .bindingMode(RestBindingMode.json);
		
		 rest().get("/hello-world").produces("application/json").route()
		      .setBody(constant("Welcome to java techie"));
		
		 rest().get("/get-orders").produces("application/json").route()
		      .setBody(() -> orderService.getAllOrders());
		
		 rest().post("/add-order").consumes("application/json").type(Order.class).outType(Order.class)
		      .route().process(orderProcessor);
		 
		 /**
		  * EQUITY BANK PAYMENTS
		  */
		 rest().post("/api/v1/payments").consumes("application/json").type(EquityBankPaymentRequest.class)
		       .outType(EquityBankPaymentResponse.class)
		       .route().process(new Processor() {
				@Override
				public void process(Exchange exchange) throws Exception {
					// TODO Auto-generated method stub
					EquityBankPaymentRequest paymentRequest = exchange.getIn().getBody(EquityBankPaymentRequest.class);
					System.out.println(">>> Received request: " + paymentRequest);
					Transaction trans = new Transaction();
					trans.setIpn_id(paymentRequest.getBankreference());
					trans.setChannel("EQUITY");
					trans.setMpesa_msisdn(paymentRequest.getPhonenumber());
					trans.setMpesa_acc(paymentRequest.getCustomerRefNumber());
					trans.setMessage(paymentRequest.getTranParticular());
					trans.setBusiness_number("921125");
					trans.setDate_added(new Date());
					trans.setDestination(paymentRequest.getPhonenumber());
					trans.setMpesa_amt(Double.parseDouble(paymentRequest.getBillAmount()));
					trans.setMpesa_code(paymentRequest.getBankreference());
					trans.setMpesa_sender(paymentRequest.getDebitcustname());
					trans.setMpesa_trx_date(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
					trans.setMpesa_trx_time(new SimpleDateFormat("HH:mm:ss").format(new Date()));
					trans.setMpesa_acc(paymentRequest.getCustomerRefNumber());
					trans.setMtimestamp(new Date());
					transactionService.addTransaction(trans);
					
					OutMessage outMessage = new OutMessage();
					outMessage.setMessageTypeID(10);
					outMessage.setMSISDN(trans.getMpesa_msisdn());
					outMessage.setSenderID("CPF");
					outMessage.setMessageContent(String.format(
							"Dear %1$s a transaction of KES %2$s paid vaia EQUITY BANK has been credited to your MPESION A/C. %3$s on %4$s", 
							paymentRequest.getDebitcustname(),
							paymentRequest.getBillAmount().toString(),
							paymentRequest.getCustomerRefNumber(),
							new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
							));
					outMessage.setMessageLength(outMessage.getMessageContent().length());
					outMessage.setMessagePages(0);
					outMessage.setStatusCode(0);
					outMessage.setOveralStatus(0);
					outMessage.setBucketID(0);
					outMessage.setFirstSend(new Date());
					outMessage.setNextSend(new Date());
					outMessage.setNumberOfSends(0);
					outMessage.setDateCreated(new Date());
					outMessage.setDateModified(new Date());
					System.out.println("outMessage >>> " + outMessage);
					// schedule a message
					outMessageService.addOutMessage(outMessage);

					exchange.getIn().setBody(new EquityBankPaymentResponse("OK", "SUCCESSFUL"));
				}
			})
		    .setHeader(Exchange.HTTP_RESPONSE_CODE,constant(200));
		 
		 /**
		  *  PROCESS ALL BILL VALIDATION REQUESTS FROM EQUITY BANK
		  */
		 rest().post("/api/v1/fetchBills").consumes("application/json").type(EquityBankBillRequest.class).route()
		         .process(new Processor() {
						@Override
						public void process(Exchange exchange) throws Exception {
							EquityBankBillRequest msg = exchange.getIn().getBody(EquityBankBillRequest.class);
							exchange.getIn().setHeader("customerId", msg.getAccount());
							exchange.getIn().setHeader("company", "EQUITY");
						}
					})
		         .to("direct:remoteValidationService");
		 
		 
		 /**
		  * PROCESS ALL BILL VALIDATION REQUESTS FROM MPESA BILLS MANAGER SERVICE
		  */
		 rest().post("/fetch-custbill").consumes("application/json").type(MPESABillRequest.class).route()
	            .process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						MPESABillRequest msg = exchange.getIn().getBody(MPESABillRequest.class);
						exchange.getIn().setHeader("customerId", msg.getAccount_number());
						exchange.getIn().setHeader("company", "MPESA");
					}
				})
	            .to("direct:remoteValidationService");
		 
		 
		 from("direct:remoteValidationService")
		    .log("***** ${in.header.customerId}").marshal().json(JsonLibrary.Jackson)
		    // .toD("http://localhost:8081/customers/${in.header.customerId}?bridgeEndpoint=true")
		    .toD(validationURL + "/${in.header.customerId}?bridgeEndpoint=true")
		    .unmarshal().json(JsonLibrary.Jackson, CustomerInfo.class)
		    .process(new Processor() {
				@Override
				public void process(Exchange exchange) throws Exception {
					// System.out.println("Body >>>> " + exchange.getIn().getBody());
					System.out.println("COMPANY >>> " + exchange.getIn().getHeader("company"));
					String company = (String) exchange.getIn().getHeader("company");
					CustomerInfo msg = exchange.getIn().getBody(CustomerInfo.class);
					
					if (company.equals("EQUITY")) {
						EquityBankBillResponse resp = new EquityBankBillResponse();
						resp.setAmount(1500);
						resp.setBillName(msg.getNAME());
						resp.setBillNumber(msg.getNATIONAL_ID());
						resp.setBillerCode("921125");
						resp.setCreatedOn(new Date());
						resp.setCurrencyCode("KES");
						resp.setCustomerName(msg.getNAME());
						resp.setCustomerRefNumber(msg.getVENDOR_NUMBER());
						resp.setDescription("IPP Scheme Contributions");
						resp.setDueDate(new Date());
						resp.setType("1");
						exchange.getIn().setBody(resp);
					} else if (company.equals("MPESA")) {
						MPESABillResponse resp = new MPESABillResponse();
						resp.setAccount_number(msg.getNATIONAL_ID());
						resp.setAccount_name(msg.getNAME());
						resp.setAccount_balance(1500);
						resp.setMsisdn(msg.getPHONE_NUMBER());
						resp.setAmount_due(1500);
						resp.setLast_invoice_date(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
						resp.setDue_date(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
						exchange.getIn().setBody(resp);
					}
				}
			});
		    // .setHeader(Exchange.HTTP_RESPONSE_CODE,constant(200));
	} 

}
