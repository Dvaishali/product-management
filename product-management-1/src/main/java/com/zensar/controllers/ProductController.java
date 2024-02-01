package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.ProductDTO;
import com.zensar.entities.Product;
import com.zensar.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/product")
	public Iterable<Product> getAllProductList() {
		return productService.getAllProductList();
	}
	
	@PostMapping("/")
	public ResponseEntity<ProductDTO> insertProduct(@RequestBody ProductDTO product) {
		return new ResponseEntity<ProductDTO>(productService.insertProduct(product),HttpStatus.CREATED);
	}
}
