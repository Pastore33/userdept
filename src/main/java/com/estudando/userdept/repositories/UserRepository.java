package com.estudando.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
