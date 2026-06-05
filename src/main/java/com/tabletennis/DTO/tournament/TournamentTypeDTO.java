package com.tabletennis.DTO.tournament;

import lombok.Getter;

@Getter
public class TournamentTypeDTO {
    private int id;
    private String type;

    public TournamentTypeDTO(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
