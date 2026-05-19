package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"player", "game"})
@Entity
@Table(name = "PlayerGame")
@IdClass(PlayerGame.PlayerGameId.class)
public class PlayerGame {
    @Id
    @ManyToOne
    @JoinColumn(name = "idPlayer", nullable = false)
    private Player player;

    @Id
    @ManyToOne
    @JoinColumn(name = "idGame", nullable = false)
    private Game game;

    @Column(name = "pointsWon", nullable = false)
    private Integer pointsWon = 0;

    @Column(name = "pointsLost", nullable = false)
    private Integer pointsLost = 0;

    @Column(name = "setsWon", nullable = false)
    private Integer setsWon = 0;

    @Column(name = "setsLost", nullable = false)
    private Integer setsLost = 0;

    @Column(name = "yellowCards")
    private Integer yellowCards = 0;

    @Column(name = "yellowRedCards")
    private Integer yellowRedCards = 0;

    @Column(name = "timeOuts")
    private Integer timeOuts = 0;

    @Column(name = "pointsWonOnService")
    private Integer pointsWonOnService = 0;

    @Column(name = "pointsLostOnService")
    private Integer pointsLostOnService = 0;

    @Column(name = "pointsWonOnReceive")
    private Integer pointsWonOnReceive = 0;

    @Column(name = "pointsLostOnReceive")
    private Integer pointsLostOnReceive = 0;

    @Getter
    @Setter
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class PlayerGameId implements Serializable {
        private int player;
        private int game;
    }
}