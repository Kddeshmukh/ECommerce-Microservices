package com.ecommerce.user_auth_service.controller;

import com.ecommerce.user_auth_service.dto.LoginRequest;
import com.ecommerce.user_auth_service.dto.RegisterRequest;
import com.ecommerce.user_auth_service.entity.User;
import com.ecommerce.user_auth_service.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request   ){
        User user = userService.register(request);
        return ResponseEntity.ok("User Registered Successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        userService.login(request);

        return ResponseEntity.ok("Login successful");
    }
}
