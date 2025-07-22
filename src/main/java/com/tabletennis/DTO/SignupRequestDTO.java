
package com.tabletennis.DTO;

public class SignupRequestDTO {
    private String username;
    private String password;

    public SignupRequestDTO() {}

    public SignupRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
