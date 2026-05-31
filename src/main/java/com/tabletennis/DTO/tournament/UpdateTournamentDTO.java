package com.tabletennis.DTO.tournament;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTournamentDTO {
    private String name;
    private String description;
    private Integer idType;
    private Integer idModality;
    private Integer idCategory;
}
