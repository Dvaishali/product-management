package com.zensar.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name= "Id")
	private int productId;
	@Column(name= "name")
	private String productName;
	@Column(name= "cost")
	private int productCost;

}
