package com.tabletennis.DTO;

public class CoachDTO {
    private Integer id;
    private Integer idClub;
    private String name;

    public CoachDTO() {}

    public CoachDTO(Integer id, Integer idClub, String name) {
        this.id = id;
        this.idClub = idClub;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
