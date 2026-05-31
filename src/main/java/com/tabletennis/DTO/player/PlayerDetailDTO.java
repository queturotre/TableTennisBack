package com.tabletennis.DTO.player;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlayerDetailDTO {
    private Integer idPlayer;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;
    private Integer advtg;
    private String hand;
    private String club;
    private String bladeName;
    private String blackRubberName;
    private String coloredRubberName;
    private String coach;
    private Integer idClub;
    private Integer idBlade;
    private Integer idBlackRubber;
    private Integer idColoredRubber;
    private Integer idCoach;

    public PlayerDetailDTO(
            Integer idPlayer, String name, Integer height, Integer weight,
            String gender, Integer advtg, String hand,
            String club, String bladeName, String blackRubberName,
            String coloredRubberName, String coach,
            Integer idClub, Integer idBlade, Integer idBlackRubber,
            Integer idColoredRubber, Integer idCoach) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.advtg = advtg;
        this.hand = hand;
        this.club = club;
        this.bladeName = bladeName;
        this.blackRubberName = blackRubberName;
        this.coloredRubberName = coloredRubberName;
        this.coach = coach;
        this.idClub = idClub;
        this.idBlade = idBlade;
        this.idBlackRubber = idBlackRubber;
        this.idColoredRubber = idColoredRubber;
        this.idCoach = idCoach;
    }
}