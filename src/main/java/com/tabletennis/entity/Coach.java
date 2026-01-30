package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCoach", nullable = false)
    private int idCoach;

    @ManyToOne
    @JoinColumn(name = "idClub", nullable = false)
    private Club club;

    @Column(name = "name", nullable = false)
    private String name;

    public int getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(int idCoach) {
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
