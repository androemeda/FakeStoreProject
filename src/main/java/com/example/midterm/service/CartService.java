package com.example.midterm.service;

import com.example.midterm.model.Cart;

import java.util.ArrayList;

public interface CartService {

    ArrayList<Cart> getAllCarts();

    Cart getSingleCart(Long id);

    Cart createCart(Cart cart);
}
