package com.shobhit.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="message-producer", url="http://localhost:8081/FeignProducerService/message")
public interface ProducerClientService {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name);
}