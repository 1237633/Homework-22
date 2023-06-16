package com.example.homework22.services;

import com.example.homework22.Cart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartServiceImpl implements CartService {

    private Cart cart;

    Logger log = LoggerFactory.getLogger(Cart.class);

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public ArrayList<Integer> getCart() {
        return cart.getCart();
    }

    @Override
    public void addToCart(Integer id) {
        cart.add(id);
        log.info("Added id " + id + " to cart " + cart.getCartId());
    }
}
