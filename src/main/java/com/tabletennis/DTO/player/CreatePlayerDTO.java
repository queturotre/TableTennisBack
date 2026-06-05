package com.tabletennis.DTO.player;

public record CreatePlayerDTO(
    String name,
    Integer height,
    Integer weight,
    String gender,
    Integer idClub,
    Integer idBlade,
    Integer idBlackRubber,
    Integer idColoredRubber,
    Integer idCoach,
    Integer advtg,
    String hand,
    Integer idTournament
) {}