package com.springweb.service;

import java.math.BigDecimal;
import java.util.Map;

import com.springweb.exception.NotEnoughProductsInStockException;
import com.springweb.model.Product;

public interface ShoppingCartService {
    void addProduct(Product product);
    void removeProduct(Product product);
    Map<Product, Integer> getProductsInCart();
    void checkout() throws NotEnoughProductsInStockException;
    BigDecimal getTotal();
}

