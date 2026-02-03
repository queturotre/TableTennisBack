package com.tabletennis.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

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

    public PlayerTournament() {}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getPointsWon() {
        return pointsWon;
    }

    public void setPointsWon(Integer pointsWon) {
        this.pointsWon = pointsWon;
    }

    public Integer getPointsLost() {
        return pointsLost;
    }

    public void setPointsLost(Integer pointsLost) {
        this.pointsLost = pointsLost;
    }

    public Integer getSetsWon() {
        return setsWon;
    }

    public void setSetsWon(Integer setsWon) {
        this.setsWon = setsWon;
    }

    public Integer getSetsLost() {
        return setsLost;
    }

    public void setSetsLost(Integer setsLost) {
        this.setsLost = setsLost;
    }

    public Integer getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(Integer matchesWon) {
        this.matchesWon = matchesWon;
    }

    public Integer getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(Integer matchesLost) {
        this.matchesLost = matchesLost;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getYellowRedCards() {
        return yellowRedCards;
    }

    public void setYellowRedCards(Integer yellowRedCards) {
        this.yellowRedCards = yellowRedCards;
    }

    public Integer getTimeOuts() {
        return timeOuts;
    }

    public void setTimeOuts(Integer timeOuts) {
        this.timeOuts = timeOuts;
    }

    public Integer getPointsWonOnService() {
        return pointsWonOnService;
    }

    public void setPointsWonOnService(Integer pointsWonOnService) {
        this.pointsWonOnService = pointsWonOnService;
    }

    public Integer getPointsLostOnService() {
        return pointsLostOnService;
    }

    public void setPointsLostOnService(Integer pointsLostOnService) {
        this.pointsLostOnService = pointsLostOnService;
    }

    public Integer getPointsWonOnReceive() {
        return pointsWonOnReceive;
    }

    public void setPointsWonOnReceive(Integer pointsWonOnReceive) {
        this.pointsWonOnReceive = pointsWonOnReceive;
    }

    public Integer getPointsLostOnReceive() {
        return pointsLostOnReceive;
    }

    public void setPointsLostOnReceive(Integer pointsLostOnReceive) {
        this.pointsLostOnReceive = pointsLostOnReceive;
    }

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