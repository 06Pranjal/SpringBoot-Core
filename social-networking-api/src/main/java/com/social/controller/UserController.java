package com.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.demo.entity.User;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return Arrays.asList(
            new User(1, "Alice", "alice@email.com"),
            new User(2, "Bob", "bob@email.com")
        );
    }
}
