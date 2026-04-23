package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Sequential increment
    @Column(name = "idCoach", nullable = false)
    private Integer idCoach;

    @ManyToOne // Many Coaches to only one club
    @JoinColumn(name = "idClub", nullable = false)
    private Club club;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public Coach(){}

    public Integer getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(Integer idCoach) {
        this.idCoach = idCoach;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
