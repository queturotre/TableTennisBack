package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTournament", nullable = false)
    private int idTournament;

    @ManyToOne
    @JoinColumn(name = "idType", nullable = false)
    private TournamentType tournamentType;

    @ManyToOne
    @JoinColumn(name = "idWinner") // It may be null when the tournament hasn't finished.
    private Player idWinner;

    @ManyToOne
    @JoinColumn(name = "idStructure", nullable = false)
    private TournamentStructure idStructure;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = true, length = 255)
    private String description;

    public Tournament(){}

    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(TournamentType tournamentType) {
        this.tournamentType = tournamentType;
    }

    public Player getIdWinner() {
        return idWinner;
    }

    public void setIdWinner(Player idWinner) {
        this.idWinner = idWinner;
    }

    public TournamentStructure getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(TournamentStructure idStructure) {
        this.idStructure = idStructure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
