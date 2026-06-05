package com.tabletennis.DTO.tournament;

public record TournamentListDTO (
    Integer idTournament,
    String name,
    String type,
    String modality,
    String category
){}