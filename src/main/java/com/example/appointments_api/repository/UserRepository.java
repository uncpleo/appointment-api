package com.example.appointments_api.repository;

import com.example.appointments_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}