package com.example.homework22.controllers;

import com.example.homework22.services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CartControllerImpl implements CartController {

    private final CartService cartService;

    public CartControllerImpl(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    @GetMapping("/add")
    public void addToCart(@RequestParam Integer id) {
        cartService.addToCart(id);
    }

    @Override
    @GetMapping("/get")
    public ArrayList<Integer> getCart() {
        return cartService.getCart();
    }
}
