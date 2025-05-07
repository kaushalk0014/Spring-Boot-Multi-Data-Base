package com.learning.database.secondary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.database.secondary.entity.Return;
import com.learning.database.secondary.repo.ReturnOrderRepositry;

@Service
public class ReturnOrderSrvice {

	@Autowired
	private ReturnOrderRepositry repositry;

	public Return getReturnByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}
}
