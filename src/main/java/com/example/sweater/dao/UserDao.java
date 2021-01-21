package com.example.sweater.dao;

import com.example.sweater.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
