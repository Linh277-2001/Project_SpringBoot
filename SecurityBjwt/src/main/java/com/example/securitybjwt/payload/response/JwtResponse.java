package com.example.securitybjwt.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

    private String token;
    private Long id;
    private String type = "Basic";
    private String username;
    private String email;
    private List role;

    public JwtResponse(String token, Long id, String username, String email, List role) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }
}