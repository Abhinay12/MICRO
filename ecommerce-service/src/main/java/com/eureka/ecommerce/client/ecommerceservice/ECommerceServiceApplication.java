package com.eureka.ecommerce.client.ecommerceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ECommerceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceServiceApplication.class, args);
		System.out.println("ECommerceService Started at port : " + 8891);
	}

}
