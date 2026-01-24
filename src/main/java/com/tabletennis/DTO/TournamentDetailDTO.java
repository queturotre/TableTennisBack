package com.tabletennis.DTO;

public class TournamentDetailDTO {
    private Integer id;
    private String name;
    private String type;
    private String modality;
    private String category;
    private String description;

    public TournamentDetailDTO(
        Integer id, String name, String type,
        String modality, String category, String description
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.modality = modality;
        this.category = category;
        this.description = description;
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
}
