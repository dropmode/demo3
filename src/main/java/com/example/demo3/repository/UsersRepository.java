package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}