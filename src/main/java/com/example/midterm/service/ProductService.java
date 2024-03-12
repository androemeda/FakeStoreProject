package com.example.midterm.service;

import com.example.midterm.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);
}
