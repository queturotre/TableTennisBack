package com.tabletennis.DTO.tournament;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateTournamentDTO {
    private Integer idType;
    private String name;
    private Integer idModality;
    private Integer idCategory;
    private String description;
}