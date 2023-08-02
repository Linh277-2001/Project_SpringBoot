package com.example.securitya.service;

import com.example.securitya.todo.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
