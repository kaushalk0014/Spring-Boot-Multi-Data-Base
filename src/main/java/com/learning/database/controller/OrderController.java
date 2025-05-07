package com.learning.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.database.primary.entity.Order;
import com.learning.database.primary.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/newOrder")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order){
		order=service.saveOrder(order);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	
	
}
