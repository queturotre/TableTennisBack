package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idGroup")
@Entity
@Table(name = "`Group`")
public class TournamentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGroup", nullable = false)
    private int idGroup;

    @ManyToOne
    @JoinColumn(name = "idRound", nullable = false)
    private Round round;

    @Column(name = "name", nullable = false, length = 30)
    private String name;
}