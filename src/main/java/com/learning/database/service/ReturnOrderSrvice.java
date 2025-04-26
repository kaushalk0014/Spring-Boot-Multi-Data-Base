package com.learning.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.database.repo.secondary.ReturnOrderRepositry;

@Service
public class ReturnOrderSrvice {

	@Autowired
	private ReturnOrderRepositry repositry;
}
