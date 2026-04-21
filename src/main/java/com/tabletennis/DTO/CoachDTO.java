package com.tabletennis.DTO;

public class CoachDTO {
    private int id;
    private Integer idClub;
    private String name;

    public CoachDTO() {}

    public CoachDTO(int id, int idClub, String name) {
        this.id = id;
        this.idClub = idClub;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
