package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Modality")
public class Modality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModality", nullable = false)
    private int idModality;

    @Column(length = 50)
    private String name;

    public Modality(){}

    public int getIdModality() {
        return idModality;
    }

    public void setIdModality(int idModality) {
        this.idModality = idModality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
