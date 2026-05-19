package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTournament", nullable = false)
    private Integer idTournament;

    @ManyToOne
    @JoinColumn(name = "idStructure", nullable = false)
    private TournamentStructure structure;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "idWinnerPlayer") // It may be null when the tournament hasn't finished.
    private Player winnerPlayer;

    @ManyToOne
    @JoinColumn(name = "idWinnerDouble")
    private TournametDouble winnerDouble;

    @ManyToOne
    @JoinColumn(name = "idWinnerTeam")
    private Team winnerTeam;

    public Tournament(){}
}