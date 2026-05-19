package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idSet")
@Entity
@Table(name = "SetScore")
public class SetScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSet", nullable = false)
    private int idSet;

    @ManyToOne
    @JoinColumn(name = "idGame", nullable = false)
    private Game game;

    @Column(name = "setNumber", nullable = false)
    private int setNumber;

    @Column(name = "homePoints", nullable = false)
    private Integer homePoints = 0;

    @Column(name = "awayPoints", nullable = false)
    private Integer awayPoints = 0;

    @Column(name = "durationMinutes")
    private Integer durationMinutes;
}