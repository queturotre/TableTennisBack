package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idTeam")
@Entity
@Table(name = "Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTeam", nullable = false)
    private int idTeam;

    @ManyToOne
    @JoinColumn(name = "idTournament", nullable = false)
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "idPlayerA", nullable = false)
    private Player playerA;

    @ManyToOne
    @JoinColumn(name = "idPlayerB", nullable = false)
    private Player playerB;

    @ManyToOne
    @JoinColumn(name = "idPlayerC", nullable = false)
    private Player playerC;
}