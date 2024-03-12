package com.example.midterm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private String date;
    private ArrayList<Product> products;
}
