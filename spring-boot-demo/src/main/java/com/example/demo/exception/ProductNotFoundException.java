package com.example.demo.exception;

public class ProductNotFoundException extends RuntimeException{
	
	public ProductNotFoundException(String errorMessage) {
		super(errorMessage);
	}

	public ProductNotFoundException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
	
}
