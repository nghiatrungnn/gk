package com.example.gk.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.example.gk.gk.model.Cart;
 import com.example.gk.gk.repository.CartRepository;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(int id) {
        return cartRepository.findById(String.valueOf(id)).orElse(null);
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void deleteCart(int id) {
        cartRepository.deleteById(String.valueOf(id));
    }
}

