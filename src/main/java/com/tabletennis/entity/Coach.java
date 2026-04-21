package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Sequential increment
    @Column(name = "idCoach", nullable = false)
    private int idCoach;

    @ManyToOne // Many Coaches to only one club
    @JoinColumn(name = "idClub", nullable = false)
    private Club idClub;

    @Column(name = "name", nullable = false)
    private String name;

    public int getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(int idCoach) {
        this.idCoach = idCoach;
    }

    public Club getClub() {
        return idClub;
    }

    public void setClub(Club idClub) {
        this.idClub = idClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
