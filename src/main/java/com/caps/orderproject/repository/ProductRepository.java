package com.caps.orderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caps.orderproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
