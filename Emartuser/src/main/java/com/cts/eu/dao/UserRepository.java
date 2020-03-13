package com.cts.eu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.eu.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
