package com.learning.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.database.repo.primary.OrderRepositry;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry repositry;
}
