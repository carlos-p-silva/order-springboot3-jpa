package com.caps.orderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caps.orderproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
