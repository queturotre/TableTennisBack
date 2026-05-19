package com.tabletennis.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "PlayerTournament")
@IdClass(PlayerTournament.PlayerTournamentId.class)
public class PlayerTournament {
    @Id
    @ManyToOne
    @JoinColumn(name = "idPlayer", nullable = false)
    private Player player;

    @Id
    @ManyToOne
    @JoinColumn(name = "idTournament", nullable = false)
    private Tournament tournament;

    @Column(name = "gamesPlayed", nullable = false)
    private Integer gamesPlayed = 0;

    @Column(name = "pointsWon")
    private Integer pointsWon = 0;

    @Column(name = "pointsLost")
    private Integer pointsLost = 0;

    @Column(name = "setsWon", nullable = false)
    private Integer setsWon = 0;

    @Column(name = "setsLost", nullable = false)
    private Integer setsLost = 0;

    @Column(name = "matchesWon", nullable = false)
    private Integer matchesWon = 0;

    @Column(name = "matchesLost", nullable = false)
    private Integer matchesLost = 0;

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

    @Column(name = "setDifference")
    private Integer setDifference = 0;

    @Column(name = "pointDifference")
    private Integer pointDifference = 0;

    public PlayerTournament() {}

    public static class PlayerTournamentId implements Serializable {
        private Integer player;
        private Integer tournament;

        public PlayerTournamentId() {}

        public PlayerTournamentId(Integer player, Integer tournament) {
            this.player = player;
            this.tournament = tournament;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PlayerTournamentId that = (PlayerTournamentId) o;
            return Objects.equals(player, that.player) &&
                    Objects.equals(tournament, that.tournament);
        }

        @Override
        public int hashCode() {
            return Objects.hash(player, tournament);
        }
    }
}