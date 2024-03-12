package com.example.midterm.controller;

import com.example.midterm.model.Cart;
import com.example.midterm.service.CartService;
import com.example.midterm.service.FakeStoreCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

//    private CartService cartService;
    private FakeStoreCartService fakeStoreCartService;

    public CartController(FakeStoreCartService fakeStoreCartService){
        this.fakeStoreCartService = fakeStoreCartService;
    }

    @GetMapping("/check")
    public String check(){
        return "code running fine.";
    }

    @GetMapping("/carts")
    public String getAllCarts(){
        return "this is not yet implemented. please enter a cart id to get single cart.";
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") Long id) {

        return fakeStoreCartService.getSingleCart(id);
//        return null;
    }
}
