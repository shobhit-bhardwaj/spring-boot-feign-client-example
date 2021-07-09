package com.shobhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SBFeignConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SBFeignConsumerApplication.class, args);
	}
}