package com.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.model.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
