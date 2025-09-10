package com.tabletennis.controller;

import com.tabletennis.DTO.LoginRequestDTO;
import com.tabletennis.DTO.SignupRequestDTO;
import com.tabletennis.entity.User;
import com.tabletennis.repository.UserRepository;
import com.tabletennis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*") // Allows requests from my Angular
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody SignupRequestDTO signupRequest) {
        try {
            User newUser = userService.register(signupRequest.getUsername(), signupRequest.getPassword());
            return ResponseEntity.ok(newUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear usuario: " + e.getMessage());
        }
    }

    @PostMapping("/signin")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO loginRequest) {
        Optional<User> user = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    // Set roleId for a user / Only admin can make it
    @PutMapping("/{userId}/role")
    public ResponseEntity<?> updateUserRole(
            @PathVariable int userId,
            @RequestParam int newRoleId,
            @RequestParam String adminUsername
    ) {
        Optional<User> adminUser = userService.getByUsername(adminUsername);

        if (adminUser.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }

        if (adminUser.get().getIdRole() != 4) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Sólo administradores pueden cambiar roles");
        }

        try {
            User updatedUser = userService.updateUserRole(userId, newRoleId);
            return ResponseEntity.ok(updatedUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
        }
    }
}