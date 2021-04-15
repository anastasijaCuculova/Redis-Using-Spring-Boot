package com.redis.example.redisdemo.repository;

import com.redis.example.redisdemo.model.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);
}
