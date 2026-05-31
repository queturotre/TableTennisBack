package com.tabletennis.DTO.club;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClubDTO {
    private int idClub;
    private String name;
    private String delegate;

    public ClubDTO(int idClub, String name, String delegate) {
        this.idClub = idClub;
        this.name = name;
        this.delegate = delegate;
    }
}