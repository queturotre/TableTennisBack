package com.tabletennis.DTO;

public class CreateCoachDTO {
    private Integer idClub;
    private String name;

    public CreateCoachDTO(Integer idClub, String name) {
        this.idClub = idClub;
        this.name = name;
    }

    public CreateCoachDTO(){}

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
