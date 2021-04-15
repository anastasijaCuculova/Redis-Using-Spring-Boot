package com.redis.example.redisdemo.service;

import com.redis.example.redisdemo.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);
}
