package com.aggregatormarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aggregatormarketplace.service.ConsumerService;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {
	@Autowired
	ConsumerService consumerService;
	
	@GetMapping("/allConsumerProducts")
    public ResponseEntity<?> getConsumerProducts() {
        return ResponseEntity.ok(consumerService.getConsumerProducts());
    }
	
	

}
