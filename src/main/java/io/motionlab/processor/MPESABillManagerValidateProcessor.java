package io.motionlab.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import io.motionlab.model.MPESABillRequest;
import io.motionlab.model.MPESABillResponse;

@Component
public class MPESABillManagerValidateProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
       
	 MPESABillRequest message = exchange.getIn().getBody(MPESABillRequest.class);
	 //exchange.getIn().setHeader("customerId", message.getAccount_number());
	 System.out.println("*** " + message + " *** ");
	 // return new MPESABillResponse();
	}
}
