package com.tabletennis.DTO.tournament;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TournamentDetailDTO {
    private Integer idTournament;
    private String name;
    private String type;
    private String modality;
    private String category;
    private String description;
    private Integer idType;
    private Integer idModality;
    private Integer idCategory;
    private String allowedGenders;

    public TournamentDetailDTO(
            Integer idTournament, String name, String type,
            String modality, String category, String description,
            Integer idType, Integer idModality, Integer idCategory,
            String allowedGenders) {
        this.idTournament = idTournament;
        this.name = name;
        this.type = type;
        this.modality = modality;
        this.category = category;
        this.description = description;
        this.idType = idType;
        this.idModality = idModality;
        this.idCategory = idCategory;
        this.allowedGenders = allowedGenders;
    }
}