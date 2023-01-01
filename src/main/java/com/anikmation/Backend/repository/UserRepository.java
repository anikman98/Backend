package com.anikmation.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anikmation.Backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
