package com.example.login_register_demo.service;


import com.example.login_register_demo.dto.UserDto;
import com.example.login_register_demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
