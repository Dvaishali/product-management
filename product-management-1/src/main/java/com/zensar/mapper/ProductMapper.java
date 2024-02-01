package com.zensar.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.zensar.dto.ProductDTO;
import com.zensar.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

	@Mapping(source = "productId", target = "productId")
	@Mapping(source = "productName", target = "productName")
	@Mapping(source = "productCost", target = "productCost")
	ProductDTO mapToProductDto(Product product);

	@Mapping(source = "productId", target = "productId")
	@Mapping(source = "productName", target = "productName")
	@Mapping(source = "productCost", target = "productCost")
	Product mapToProduct(ProductDTO productDto);
}
