package com.tabletennis.entity;

import jakarta.persistence.*;

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

    public int getIdRole() { return idRole; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }
}