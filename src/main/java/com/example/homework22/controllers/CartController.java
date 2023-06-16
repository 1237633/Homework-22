package com.example.homework22.controllers;

import java.util.ArrayList;

public interface CartController {
    void addToCart(Integer id);

    ArrayList<Integer> getCart();
}
