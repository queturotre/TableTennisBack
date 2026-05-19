package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="TournamentStructure")
public class TournamentStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStructure", nullable = false)
    private int idStructure;

    @ManyToOne
    @JoinColumn(name = "idType", nullable = false)
    private TournamentType tournamentType;

    @ManyToOne
    @JoinColumn(name = "idModality", nullable = false)
    private Modality modality;

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    public TournamentStructure(){}
}
