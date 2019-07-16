package com.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.model.User;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="krish", groupId="group_id")
	public void consume(String message) {
		
		System.out.println("consumed message: " + message);
	}
	
	@KafkaListener(topics="nunna", groupId="group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		
		System.out.println("consumed message: " + user.getName() + " is in " + user.getDept());
	}

}
