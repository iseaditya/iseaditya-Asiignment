package com.order.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.order.service")
public class OrderServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceMain.class, args);
	}
}
