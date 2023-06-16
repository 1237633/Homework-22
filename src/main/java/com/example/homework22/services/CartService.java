package com.example.homework22.services;

import java.util.ArrayList;

public interface CartService {
    ArrayList<Integer> getCart();

    void addToCart(Integer id);

}
