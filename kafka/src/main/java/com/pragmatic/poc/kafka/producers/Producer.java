package com.pragmatic.poc.kafka.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
    
    @Autowired
	private KafkaTemplate<String, String> kafkaTemplate;


    String kafkaTopic = "topic1";
	
    @GetMapping("/api/test")
	public void send(String message) {
	    kafkaTemplate.send(kafkaTopic, "hello consumer");
	}

}
