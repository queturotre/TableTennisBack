package com.tabletennis.DTO.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreatePlayerDTO {
    private String name; // Mandatory field
    private Integer height;
    private Integer weight;
    private String gender;
    private Integer idClub;
    private Integer idBlade;
    private Integer idBlackRubber;
    private Integer idColoredRubber;
    private Integer idCoach;
    private Integer advtg;
    private String hand;
    private Integer idTournament;
}