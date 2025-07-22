package com.tabletennis.DTO;

import com.tabletennis.entity.User;

public class LoginResponseDTO {
    private int idUser;
    private String username;
    private String role;

    public LoginResponseDTO(User user, String roleName) {
        this.idUser = user.getIdUser();
        this.username = user.getUsername();
        this.role = roleName;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
