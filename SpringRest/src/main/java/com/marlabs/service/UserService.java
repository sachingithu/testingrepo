package com.marlabs.service;

import java.util.List;

import com.marlabs.model.User;
import com.marlabs.model.UserDTO;

public interface UserService {
    User save(UserDTO user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDTO update(UserDTO userDto);
}
