package com.bilalov.java_spring_eshop.dao;

import com.bilalov.java_spring_eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}