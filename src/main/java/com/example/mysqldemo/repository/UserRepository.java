package com.example.mysqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mysqldemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
