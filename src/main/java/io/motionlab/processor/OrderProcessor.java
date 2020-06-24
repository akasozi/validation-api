package io.motionlab.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.motionlab.model.Order;
import io.motionlab.service.OrderService;

@Component
public class OrderProcessor implements Processor {
	
	@Autowired
	private OrderService orderService;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		orderService.addOrder(exchange.getIn().getBody(Order.class));
	}
}
