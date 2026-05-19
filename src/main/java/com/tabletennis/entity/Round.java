package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idRound")
@Entity
@Table(name = "Round")
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRound", nullable = false)
    private int idRound;

    @ManyToOne
    @JoinColumn(name = "idTournament", nullable = false)
    private Tournament tournament;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "roundOrder", nullable = false)
    private int roundOrder;
}