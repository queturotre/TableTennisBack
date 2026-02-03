package com.tabletennis.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlayer", nullable = false)
    private Integer idPlayer;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "advtg")
    private Integer advtg;

    @Column(name = "hand", length = 1)
    private String hand;

    @ManyToOne
    @JoinColumn(name = "idClub")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "idBlade")
    private Blade blade;

    @ManyToOne
    @JoinColumn(name = "idBlackRubber")
    private Rubber blackRubber;

    @ManyToOne
    @JoinColumn(name = "idColoredRubber")
    private Rubber coloredRubber;

    @ManyToOne
    @JoinColumn(name = "idCoach")
    private Coach coach;

    @OneToMany(mappedBy = "player")
    private Set<PlayerTournament> playerTournaments;

    public Player() {}

    public Set<PlayerTournament> getPlayerTournaments() {
        return playerTournaments;
    }

    public void setPlayerTournaments(Set<PlayerTournament> playerTournaments) {
        this.playerTournaments = playerTournaments;
    }

    public Integer getIdPlayer() { return idPlayer; }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAdvtg() {
        return advtg;
    }

    public void setAdvtg(Integer advtg) {
        this.advtg = advtg;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Blade getBlade() {
        return blade;
    }

    public void setBlade(Blade blade) {
        this.blade = blade;
    }

    public Rubber getBlackRubber() {
        return blackRubber;
    }

    public void setBlackRubber(Rubber blackRubber) {
        this.blackRubber = blackRubber;
    }

    public Rubber getColoredRubber() {
        return coloredRubber;
    }

    public void setColoredRubber(Rubber coloredRubber) {
        this.coloredRubber = coloredRubber;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
