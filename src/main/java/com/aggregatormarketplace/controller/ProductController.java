package com.aggregatormarketplace.controller;

import com.aggregatormarketplace.model.Product;
import com.aggregatormarketplace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/allProducts")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(productService.getProductById(productId));
    }
    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.saveProduct(product));
    }
    @DeleteMapping("/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(productService.deleteProductById(productId));
    }
}
