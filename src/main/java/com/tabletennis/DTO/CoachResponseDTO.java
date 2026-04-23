package com.tabletennis.DTO;

public class CoachResponseDTO {
    private Integer idCoach;
    private String name;
    private String clubName;

    public CoachResponseDTO(Integer idCoach, String name, String clubName) {
        this.idCoach = idCoach;
        this.name = name;
        this.clubName = clubName;
    }

    public CoachResponseDTO(){}

    public Integer getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(Integer idCoach) {
        this.idCoach = idCoach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
