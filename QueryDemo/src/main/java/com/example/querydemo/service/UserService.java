package com.example.querydemo.service;

import com.example.querydemo.model.User;
import com.example.querydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUserByHp(int hp){
        return userRepository.findByHp(hp);
    }

    public User getUserByDef(int def){
        return userRepository.findUserByDef(def);
    }
}
