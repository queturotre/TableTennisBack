package com.tabletennis.DTO.tournament;

public record UpdateTournamentDTO(
    String name,
    String description,
    Integer idType,
    Integer idModality,
    Integer idCategory
) {}
