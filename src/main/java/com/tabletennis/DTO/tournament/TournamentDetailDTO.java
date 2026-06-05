package com.tabletennis.DTO.tournament;

public record TournamentDetailDTO(
    Integer idTournament,
    String name,
    String type,
    String modality,
    String category,
    String description,
    Integer idType,
    Integer idModality,
    Integer idCategory,
    String allowedGenders
) {}