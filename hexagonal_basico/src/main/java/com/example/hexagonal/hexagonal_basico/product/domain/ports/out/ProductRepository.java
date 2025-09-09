package com.example.hexagonal.hexagonal_basico.product.domain.ports.out;

import com.example.hexagonal.hexagonal_basico.product.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);
    Optional<Product> findById(long id);
    List<Product> findAll();
    Optional<Product> update(Product product);
    boolean deletebyId(long id);
}
