package com.tabletennis.service;

import com.tabletennis.entity.User;
import com.tabletennis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

//    public User register(User user) {
//        String hashedPassword = passwordEncoder.encode(user.getPasswordHash());
//        user.setPasswordHash(hashedPassword);
//        return userRepository.save(user);
//    }

    public User register(User user) {
        String hashedPassword = passwordEncoder.encode(user.getPasswordHash());
        System.out.println("Hasheando contraseña: " + hashedPassword);
        user.setPasswordHash(hashedPassword);
        return userRepository.save(user);
    }

    public Optional<User> login(String username, String passwordHash) {
        return userRepository.findByUsername(username)
                .filter(user -> passwordEncoder.matches(passwordHash, user.getPasswordHash()));
    }

    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
