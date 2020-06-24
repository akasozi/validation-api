package io.motionlab.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.motionlab.model.Order;

@Service
public class OrderService {
	
	
	private List<Order> orders = new ArrayList<>(Arrays.asList(
										new Order(1, "Wheels", 11000),
										new Order(1, "Mobile", 99000),
										new Order(1, "Television", 55000)));
	
	
	public List<Order> getAllOrders() {
		return orders;
	}

	public Order addOrder(Order order) {
		orders.add(order);
		return order;
	}
	
}
