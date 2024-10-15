package com.example.gk.gk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

        import com.example.gk.gk.model.Cart;

        public interface CartRepository extends JpaRepository<Cart, String> {
 }
