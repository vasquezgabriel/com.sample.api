package com.sample.api.service;

import com.sample.api.model.dto.login.LoginRequest;
import com.sample.api.model.dto.login.LoginResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginService {

    public LoginResponse login(LoginRequest loginRequest) {
        var loginResponse = new LoginResponse();

        if ((loginRequest.getUsername().equalsIgnoreCase("jesus")
                || loginRequest.getUsername().equalsIgnoreCase("ariadne"))
                && loginRequest.getPassword().equals("admin")) {
            loginResponse.setAccessToken(UUID.randomUUID().toString());
            loginResponse.setRefreshToken(UUID.randomUUID().toString());
        }

        return loginResponse;
    }

}
