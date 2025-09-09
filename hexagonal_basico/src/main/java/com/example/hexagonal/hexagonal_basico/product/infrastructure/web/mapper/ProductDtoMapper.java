package com.example.hexagonal.hexagonal_basico.product.infrastructure.web.mapper;

import com.example.hexagonal.hexagonal_basico.product.domain.model.Product;
import com.example.hexagonal.hexagonal_basico.product.infrastructure.web.dto.ProductRequest;
import com.example.hexagonal.hexagonal_basico.product.infrastructure.web.dto.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {

    public Product toDomain(ProductRequest productRequest) {
        if (productRequest == null) {
            return null;
        }

        return new Product(null, productRequest.getDescription(), productRequest.getPrice());
    }

    public ProductResponse toResponse(Product product) {
        if (product == null) {
            return null;
        }

        return new ProductResponse(product.getId(), product.getDescription(), product.getPrice());
    }
}
