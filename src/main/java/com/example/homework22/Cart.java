package com.example.homework22;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;

@Repository
@SessionScope
public class Cart {
    private ArrayList<Integer> cart;
    private static int cartsCount = 0;
    private int cartId;

    Logger log = LoggerFactory.getLogger(Cart.class);

    public Cart() {
        this.cart = new ArrayList<Integer>();
        cartsCount++;
        cartId = cartsCount;
    }

    public ArrayList<Integer> getCart() {
        return cart;
    }

    public void add(Integer id){
        cart.add(id);
    }


    @PostConstruct
    private void startupMsg() {
        log.info("Cart " + cartId + " created " );
    }

    @PreDestroy
    private void destroyMsg(){
        log.info("Cart " + cartId + " destroyed");
    }

    public int getCartId() {
        return cartId;
    }
}
