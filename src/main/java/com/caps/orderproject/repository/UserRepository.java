package com.caps.orderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caps.orderproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
