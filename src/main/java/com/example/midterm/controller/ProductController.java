package com.example.midterm.controller;

import com.example.midterm.model.Product;
import com.example.midterm.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts() {
        return "this method is not yet implemented. write product id to get single product details.";
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {

        return productService.getSingleProduct(id);
    }
}
