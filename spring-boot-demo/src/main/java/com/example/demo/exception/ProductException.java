package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class ProductException {

	private String message;
	private Throwable cause;
	private HttpStatus httpStatus;
	
	public String getMessage() {
		return message;
	}
	public Throwable getCause() {
		return cause;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public ProductException(String message, Throwable cause, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.cause = cause;
		this.httpStatus = httpStatus;
	}
	public ProductException() {
		super();
	}
	
	
	
	
}
