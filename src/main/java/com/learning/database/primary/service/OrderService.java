package com.learning.database.primary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.database.primary.repo.OrderRepositry;

@Service
public class OrderService {

	@Autowired
	private OrderRepositry repositry;
}
