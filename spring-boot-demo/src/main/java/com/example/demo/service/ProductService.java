package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Product;

public interface ProductService {

	public Iterable<Product> getAllProductList();

	 public Product getProduct(int productId);
	
	public Product insertProduct(Product product);
	
	public void deleteProduct(int productId);
	
	public Product updateProduct(int productId, @RequestBody Product pro);
}
