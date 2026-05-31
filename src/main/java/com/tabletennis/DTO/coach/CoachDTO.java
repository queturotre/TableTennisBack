package com.tabletennis.DTO.coach;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CoachDTO {
    private Integer idCoach;
    private Integer idClub;
    private String name;

    public CoachDTO(Integer idCoach, Integer idClub, String name) {
        this.idCoach = idCoach;
        this.idClub = idClub;
        this.name = name;
    }
}