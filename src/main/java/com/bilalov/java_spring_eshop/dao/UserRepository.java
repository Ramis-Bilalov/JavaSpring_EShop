package com.bilalov.java_spring_eshop.dao;

import com.bilalov.java_spring_eshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
}