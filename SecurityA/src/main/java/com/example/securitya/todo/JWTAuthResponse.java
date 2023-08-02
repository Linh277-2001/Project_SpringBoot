package com.example.securitya.todo;

import lombok.Data;

@Data
public class JWTAuthResponse {
    private String accessToken;
    private String tokenType="Bearer";

}
