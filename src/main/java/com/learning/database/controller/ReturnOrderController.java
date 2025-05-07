package com.learning.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.database.secondary.entity.Return;
import com.learning.database.secondary.service.ReturnOrderSrvice;

@RestController
public class ReturnOrderController {

	@Autowired
	private ReturnOrderSrvice service;

	@GetMapping("/getreturn/byOrderId")
	public ResponseEntity<Return> getReturnByOrderId(@RequestParam(name = "orderId") String orderId) {

		Return returnOrder = service.getReturnByOrderId(orderId);
		return new ResponseEntity<Return>(returnOrder, HttpStatus.OK);
	}

}
