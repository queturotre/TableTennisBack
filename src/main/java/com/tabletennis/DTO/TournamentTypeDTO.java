package com.tabletennis.DTO;

public class TournamentTypeDTO {
    private int id;
    private String type;

    public TournamentTypeDTO(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public TournamentTypeDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
