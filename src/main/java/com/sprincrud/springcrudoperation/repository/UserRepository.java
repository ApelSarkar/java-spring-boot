package com.sprincrud.springcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprincrud.springcrudoperation.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
