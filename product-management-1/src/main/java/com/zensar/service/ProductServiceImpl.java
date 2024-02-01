package com.zensar.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.ProductDTO;
import com.zensar.entities.Product;
import com.zensar.mapper.ProductMapper;
import com.zensar.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public ProductDTO insertProduct(ProductDTO product) {
		
		/*
		 * Product products = new Product();
		 * products.setProductId(product.getProductId());
		 * products.setProductName(product.getProductName());
		 * products.setProductCost(product.getProductCost());
		 */
		Product products = modelMapper.map(product, Product.class);
		//Product products = ProductMapper.MAPPER.mapToProduct(product);
		Product saveProduct = productRepository.save(products);
		
		/*
		 * ProductDTO productDTO = new ProductDTO();
		 * productDTO.setProductId(saveProduct.getProductId());
		 * productDTO.setProductName(saveProduct.getProductName());
		 * productDTO.setProductCost(saveProduct.getProductCost());
		 */
		return modelMapper.map(saveProduct, ProductDTO.class);
		//return ProductMapper.MAPPER.mapToProductDto(saveProduct);
	}

	public List<Product> getAllProductList() {
		return productRepository.findAll();
	}
}
