package com.tabletennis.DTO;

public class TournamentListDTO {
    private int idTournament;
    private String name;
    private String type;
    private String modality;
    private String category;

    public TournamentListDTO(int idTournament, String name, String type, String modality, String category) {
        this.idTournament = idTournament;
        this.name = name;
        this.type = type;
        this.modality = modality;
        this.category = category;
    }

    public TournamentListDTO() {
    }

    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
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
}
