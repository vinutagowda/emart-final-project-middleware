package com.cts.eu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.eu.model.Registration;
import com.cts.eu.model.User;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
    Registration findByUsername(String username);
}