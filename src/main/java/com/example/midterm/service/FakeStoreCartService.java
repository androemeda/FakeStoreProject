package com.example.midterm.service;

import com.example.midterm.dtos.FakeStoreCartDto;
import com.example.midterm.model.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreCartService implements CartService{

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public ArrayList<Cart> getAllCarts() {
        return null;
    }

    @Override
    public Cart getSingleCart(Long id) {
        System.out.println(id + "========================");

        FakeStoreCartDto fakeStoreCartDto = restTemplate.getForObject("https://fakestoreapi.com/carts/"+id , FakeStoreCartDto.class);

        Cart cart = new Cart();

        cart.setId(fakeStoreCartDto.getId());
        cart.setDate(fakeStoreCartDto.getDate());
        cart.setUserId(fakeStoreCartDto.getUserId());
        cart.setProducts(fakeStoreCartDto.getProducts());
        return cart;
    }

    @Override
    public Cart createCart(Cart cart) {
        return null;
    }

}
