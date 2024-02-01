package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
public class Product {

	@Id
	private int productId;
	private String productName;
	private int productCost;

}

/*
 * public record Product(int productId, String productName, int productCost) {}
 */