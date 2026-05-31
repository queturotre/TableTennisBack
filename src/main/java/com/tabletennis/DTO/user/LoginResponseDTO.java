package com.tabletennis.DTO.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginResponseDTO {
    private int idUser;
    private String username;
    private String role;

    public LoginResponseDTO(int idUser, String username, String role) {
        this.idUser = idUser;
        this.username = username;
        this.role = role;
    }
}