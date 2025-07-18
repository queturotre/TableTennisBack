package com.tabletennis.controller;

import com.tabletennis.entity.User;
import com.tabletennis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*") // Permitir llamadas desde el frontend Angular
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/signin")
    public Optional<User> login(@RequestBody User user) {
        return userService.login(user.getUsername(), user.getPasswordHash());
    }
}
