package com.zensar.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductDTO {
	
	private int productId;
	private String productName;
	private int productCost;

}
