package com.eureka.registry.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class RegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
		System.out.println("RegistryService Started at port : " + 8761);
	}

}
