package com.tabletennis.DTO.player;

public record PlayerDTO (
    Integer idPlayer,
    String name,
    Integer height,
    Integer weight,
    String gender,
    String club,
    String blade,
    String blackRubber,
    String coloredRubber,
    String coach,
    Integer advtg,
    String hand
){}