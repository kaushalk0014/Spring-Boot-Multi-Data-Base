package com.learning.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.learning.database.service.ReturnOrderSrvice;

@RestController
public class ReturnOrderController {

	@Autowired
	private ReturnOrderSrvice service;
}
