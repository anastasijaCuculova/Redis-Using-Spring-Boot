package com.redis.example.redisdemo.repository;

import com.redis.example.redisdemo.model.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private RedisTemplate redisTemplate;
    private static final String key = "USER";

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(key, user.getId(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users;
        users = redisTemplate.opsForHash().values(key);
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return (User) redisTemplate.opsForHash().get(key, id.toString());
    }

    @Override
    public boolean deleteUser(Long id) {
        try {
            redisTemplate.opsForHash().delete(key, id.toString());
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
