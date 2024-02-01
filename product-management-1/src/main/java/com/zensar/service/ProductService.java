package com.zensar.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.zensar.dto.ProductDTO;
import com.zensar.entities.Product;

public interface ProductService {
	
	public ProductDTO insertProduct(ProductDTO product);
	public List<Product> getAllProductList();

}
