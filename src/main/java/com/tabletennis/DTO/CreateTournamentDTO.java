package com.tabletennis.DTO;

public class CreateTournamentDTO {
    private Integer idType;
    private String name;
    private Integer idModality;
    private Integer idCategory;
    private String description;

    public CreateTournamentDTO() {}

    public CreateTournamentDTO(
        Integer idType,
        String name,
        Integer idModality,
        Integer idCategory,
        String description
    ) {
        this.idType = idType;
        this.name = name;
        this.idModality = idModality;
        this.idCategory = idCategory;
        this.description = description;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}