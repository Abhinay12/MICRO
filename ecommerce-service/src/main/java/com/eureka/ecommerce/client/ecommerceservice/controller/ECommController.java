package com.eureka.ecommerce.client.ecommerceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.ecommerce.client.ecommerceservice.clients.PaymentClient;

@RestController

public class ECommController {

	
/*
 * Using Feign Client we are communication with payment service to get the name 
 * http://localhost:8761/ecommerce/ecommerce-service
 */
	
	
	
	
	@Autowired
	PaymentClient paymentClient;
	@RequestMapping("/ecommerce-service")
	public ResponseEntity<String> getECommAndPaymentData()
	{
		String ecomm="ECommomData";
		String payData=paymentClient.getName();
		return new ResponseEntity<String>(payData+ecomm,HttpStatus.OK);
		
	}
}
