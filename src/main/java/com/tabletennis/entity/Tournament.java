package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTournament", nullable = false)
    private int idTournament;

    @Column(name = "idType", nullable = false)
    private int idType;

    @Column(name = "idWinner", nullable = true)
    private int idWinner;

    @Column(name = "idStructure", nullable = false)
    private int idStructure;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    public Tournament(){}
}
