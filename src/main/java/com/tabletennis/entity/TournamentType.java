package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TournamentType")
public class TournamentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idType;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(length = 255)
    private String description;

    public TournamentType() {}
}
