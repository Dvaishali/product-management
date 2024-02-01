package com.zensar.spring_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zensar.spring_annotations.beans.Product;

@Configuration
@ComponentScan("com.zensar.spring_annotations.beans")
public class JavaConfig {
	
	/*
	 * @Bean public Product getProduct() { Product p = new Product(111,"Laptop",
	 * 60000); return p; }
	 */

}
