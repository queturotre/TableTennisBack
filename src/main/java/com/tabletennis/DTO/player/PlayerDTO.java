package com.tabletennis.DTO.player;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlayerDTO {
    private Integer idPlayer;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;
    private String club;
    private String blade;
    private String blackRubber;
    private String coloredRubber;
    private String coach;
    private Integer advtg;
    private String hand;

    public PlayerDTO(
            Integer idPlayer, String name, Integer height, Integer weight,
            String gender, String club, String blade,
            String blackRubber, String coloredRubber,
            String coach, Integer advtg, String hand) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.club = club;
        this.blade = blade;
        this.blackRubber = blackRubber;
        this.coloredRubber = coloredRubber;
        this.coach = coach;
        this.advtg = advtg;
        this.hand = hand;
    }
}