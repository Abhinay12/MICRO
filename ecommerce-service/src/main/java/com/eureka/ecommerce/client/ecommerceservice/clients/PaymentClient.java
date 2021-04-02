package com.eureka.ecommerce.client.ecommerceservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("payment")
@Service
public interface PaymentClient {
	@RequestMapping(method = RequestMethod.GET, value = "/name")
	String getName();
}