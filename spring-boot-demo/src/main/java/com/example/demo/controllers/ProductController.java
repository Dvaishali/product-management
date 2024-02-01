package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products/api")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	public ProductController() {}

	// @RequestMapping(value = "/products", produces =
	// MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Product> getAllProductList() {
		return productService.getAllProductList();
	}

	@GetMapping("/{productId}")
	 public Product getProduct(@PathVariable("productId") int productId){
		 return productService.getProduct(productId);
	 }
	
	@PostMapping
	public void insertProduct(@RequestBody Product product) {
		productService.insertProduct(product);
	}
	
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);	
	}
	
	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable int productId, @RequestBody Product pro){
		return productService.updateProduct(productId, pro);
	}
}
