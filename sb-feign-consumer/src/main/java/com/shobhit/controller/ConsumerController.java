package com.shobhit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shobhit.service.ProducerClientService;

@RestController
@RequestMapping("/api")
public class ConsumerController {

	@Autowired
	private ProducerClientService producerClient;

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return producerClient.hello(name);
	}
}