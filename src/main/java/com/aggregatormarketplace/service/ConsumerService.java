package com.aggregatormarketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggregatormarketplace.repository.ProductRepository;

@Service
public class ConsumerService {
	
	@Autowired
	ProductRepository productRepository;

	public Object getConsumerProducts() {
		// TODO Auto-generated method stub
		return productRepository.findByStatus(1);
	}

}
