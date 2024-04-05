package com.example.springbootmysqldemo.dao;

import com.example.springbootmysqldemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

