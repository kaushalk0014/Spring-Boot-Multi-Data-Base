package com.learning.database.primary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.database.primary.entity.Order;
import com.learning.database.primary.repo.OrderRepositry;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry repositry;

	public Order saveOrder(Order order) {
		System.out.println(order);
		Order existOrder = repositry.findById(102)
			    .orElseThrow(() -> new EntityNotFoundException("Order not found"));
		//Order existOrder = repositry.findById(order.getId()).orElseThrow();
		System.out.println("----------------");
		return repositry.save(order);
	}
}
