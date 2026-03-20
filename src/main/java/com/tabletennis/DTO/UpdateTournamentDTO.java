package com.tabletennis.DTO;

public class UpdateTournamentDTO {
    private Integer idTournament;
    private String name;
    private String description;
    private Integer idType;
    private Integer idModality;
    private Integer idCategory;

    public UpdateTournamentDTO() {}

    public UpdateTournamentDTO(
            Integer idTournament, String name, String description,
            Integer idType, Integer idModality, Integer idCategory
    ){
        this.idTournament = idTournament;
        this.name = name;
        this.description = description;
        this.idType = idType;
        this.idModality = idModality;
        this.idCategory = idCategory;
    }

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public Integer getIdModality() {
        return idModality;
    }

    public void setIdModality(Integer idModality) {
        this.idModality = idModality;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
}