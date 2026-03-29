package com.tabletennis.DTO;

public class TournamentDetailDTO {
    private Integer id;
    private String name;
    private String type;
    private String modality;
    private String category;
    private String description;
    private Integer idType;
    private Integer idModality;
    private Integer idCategory;
    private String allowedGenders;

    public TournamentDetailDTO(
        Integer id, String name, String type,
        String modality, String category, String description,
        Integer idType, Integer idModality, Integer idCategory,
        String allowedGenders
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.modality = modality;
        this.category = category;
        this.description = description;
        this.idType = idType;
        this.idModality = idModality;
        this.idCategory = idCategory;
        this.allowedGenders = allowedGenders;
    }

    public TournamentDetailDTO() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getAllowedGenders() { return allowedGenders; }

    public void setAllowedGenders(String allowedGenders) { this.allowedGenders = allowedGenders; }
}
