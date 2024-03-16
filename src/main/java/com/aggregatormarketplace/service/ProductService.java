package com.aggregatormarketplace.service;

import com.aggregatormarketplace.model.Product;
import com.aggregatormarketplace.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int productId) {
		return productRepository.findById(productId).get();
	}

	public Product saveProduct(Product product) {
		if (product.getProductId() == null) {
			product.setCreatedDate(new Date());
			product.setStatus(0);
		} else {
			Product p1 = productRepository.findById(product.getProductId()).get();
			product.setCreatedDate(p1.getCreatedDate());
			product.setStatus(p1.getStatus());
			product.setUpdatedDate(new Date());
		}
		Product p = new Product();
		BeanUtils.copyProperties(product, p);

		productRepository.save(p);

		return p;
	}

	public Object deleteProductById(int productId) {
		productRepository.deleteById(productId);
		return "Product deleted successfully";
	}
}
