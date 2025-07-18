package com.tabletennis.service;

import com.tabletennis.entity.User;
import com.tabletennis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public Optional<User> login(String username, String passwordHash) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        return optionalUser
                .filter(user -> user.getPasswordHash().equals(passwordHash));
    }

    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
