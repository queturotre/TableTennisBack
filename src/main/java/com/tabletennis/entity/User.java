package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")  // Fuerza el nombre exacto de la tabla
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", nullable = false)
    private int idUser;

    @Column(name = "idRole", nullable = false)
    private int idRole;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "idRole", referencedColumnName = "idRole", insertable = false, updatable = false)
    private UserRole userRole;

    public User() {}

    public User(String username, String password, UserRole userRole) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public int getIdUser() { return idUser; }

    public int getIdRole() { return idRole; }

    public void setIdRole(int idRole){
        this.idRole = idRole;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }  // Getter actualizado
    public void setPassword(String password) { this.password = password; }  // Setter actualizado

    public UserRole getUserRole() { return userRole; }
    public void setUserRole(UserRole userRole) { this.userRole = userRole; }
}