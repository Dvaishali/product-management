package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Iterable<Product> getAllProductList() {
		return productRepository.findAll();
	}

	public Product getProduct(int productId) {
		if(productRepository.findById(productId).isEmpty()) 
			throw new ProductNotFoundException("Requested product does not exist");
		return productRepository.findById(productId).get();
	}

	public Product insertProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	public Product updateProduct(int productId, Product pro) {
		return productRepository.save(pro);
	}
}
