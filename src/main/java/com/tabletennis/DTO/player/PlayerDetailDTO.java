package com.tabletennis.DTO.player;

public record PlayerDetailDTO(
    Integer idPlayer,
    String name,
    Integer height,
    Integer weight,
    String gender,
    Integer advtg,
    String hand,
    String club,
    String bladeName,
    String blackRubberName,
    String coloredRubberName,
    String coach,
    Integer idClub,
    Integer idBlade,
    Integer idBlackRubber,
    Integer idColoredRubber,
    Integer idCoach
) {}