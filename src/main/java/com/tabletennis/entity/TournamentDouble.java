package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idDouble")
@Entity
@Table(name = "`Double`")
public class TournamentDouble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDouble", nullable = false)
    private int idDouble;

    @ManyToOne
    @JoinColumn(name = "idTournament", nullable = false)
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "idPlayerA", nullable = false)
    private Player playerA;

    @ManyToOne
    @JoinColumn(name = "idPlayerB", nullable = false)
    private Player playerB;
}