package com.marlabs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
