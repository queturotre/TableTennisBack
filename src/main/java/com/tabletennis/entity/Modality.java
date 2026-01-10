package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Modality")
public class Modality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModality", nullable = false)
    private int idTournament;

    @Column(length = 50)
    private String name;

    public Modality(){}

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
}
