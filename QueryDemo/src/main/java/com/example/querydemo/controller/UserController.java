package com.example.querydemo.controller;

import com.example.querydemo.model.User;
import com.example.querydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUserByHp(int hp){
      return userService.getUserByHp(hp);
    }

    @GetMapping("/def")
    public User getUserByDef(int def){
        return userService.getUserByDef(def);
    }

}
