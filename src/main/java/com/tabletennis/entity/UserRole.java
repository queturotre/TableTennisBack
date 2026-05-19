package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "UserRole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRole", nullable = false)
    private int idRole;

    @Column(name = "roleName", nullable = false)
    private String roleName;

    public UserRole() {}

    public UserRole(String roleName) {
        this.roleName = roleName;
    }
}