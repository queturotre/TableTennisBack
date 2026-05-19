package com.tabletennis.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", nullable = false)
    private int idUser;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @JsonIgnore
    @Column(name = "passwordHash", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "idRole", insertable = false, updatable = false)
    private UserRole userRole;

    public User() {}
}