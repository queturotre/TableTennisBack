package com.tabletennis.DTO.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TournamentTypeDTO {
    private int idType;
    private String name;

    public TournamentTypeDTO(int idType, String name) {
        this.idType = idType;
        this.name = name;
    }
}