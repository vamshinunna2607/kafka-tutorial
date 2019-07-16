package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Users;

@RestController
@RequestMapping("/kafka")
public class UserController {

//	@Autowired
//	KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	KafkaTemplate<String, Users> kafkaTemplate;
	
	private static final String TOPIC = "krish";
	
//	@GetMapping("/publish/{message}")
//	public String publish(@PathVariable final String message) {
//		kafkaTemplate.send(TOPIC, message);
//		return "Published Successfully";
//	}
	
	@GetMapping("/publish/{message}")
	public String publishJson(@PathVariable(name = "message") final String name) {
		kafkaTemplate.send(TOPIC, new Users(name,"IT"));
		return "Published Successfully";
	}
}
