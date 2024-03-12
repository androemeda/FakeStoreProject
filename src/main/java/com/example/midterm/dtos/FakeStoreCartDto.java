package com.example.midterm.dtos;

import com.example.midterm.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class FakeStoreCartDto {
    private Long id;
    private Long userId;
    private String date;
    private ArrayList<Product> products;
}