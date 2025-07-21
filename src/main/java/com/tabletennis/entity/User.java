package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", nullable = false)
    private Long idUser;

    @Column(name = "idRole", nullable = false)
    private Long idRole;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "passwordHash", nullable = false)
    private String passwordHash;

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "idRole", insertable = false, updatable = false)
    private UserRole userRole;

    public User() {}

    public User(String username, String passwordHash, UserRole userRole) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.userRole = userRole;
    }

    public Long getIdUser() { return idUser; }

    public Long getIdRole() { return idRole; }

    public void setIdRole(Long idRole){
        this.idRole = idRole;
    }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public UserRole getUserRole() { return userRole; }
    public void setUserRole(UserRole userRole) { this.userRole = userRole; }
}
