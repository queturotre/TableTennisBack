package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTournament", nullable = false)
    private Integer idTournament;

    @ManyToOne
    @JoinColumn(name = "idType", nullable = false)
    private TournamentType tournamentType;

    @ManyToOne
    @JoinColumn(name = "idWinner") // It may be null when the tournament hasn't finished.
    private Player winner;

    @ManyToOne
    @JoinColumn(name = "idStructure", nullable = false)
    private TournamentStructure structure;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    public Tournament(){}

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(TournamentType tournamentType) {
        this.tournamentType = tournamentType;
    }

    public Player getWinner() {  // Changed getter name
        return winner;
    }

    public void setWinner(Player winner) {  // Changed setter name
        this.winner = winner;
    }

    public TournamentStructure getStructure() {  // Changed getter name
        return structure;
    }

    public void setStructure(TournamentStructure structure) {  // Changed setter name
        this.structure = structure;
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