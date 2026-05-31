package com.tabletennis.DTO.tournament;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TournamentListDTO {
    private int idTournament;
    private String name;
    private String type;
    private String modality;
    private String category;

    public TournamentListDTO(int idTournament, String name, String type,
                             String modality, String category) {
        this.idTournament = idTournament;
        this.name = name;
        this.type = type;
        this.modality = modality;
        this.category = category;
    }
}