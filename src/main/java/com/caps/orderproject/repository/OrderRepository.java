package com.caps.orderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caps.orderproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
