package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TournamentStructure")
public class TournamentStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStructure", nullable = false)
    private int idStructure;

    @ManyToOne
    @JoinColumn(name = "idType", nullable = false)
    private TournamentType tournamentType;

    @ManyToOne
    @JoinColumn(name = "idModality", nullable = false)
    private Modality modality;

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    public TournamentStructure(){}

    public int getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(TournamentType tournamentType) {
        this.tournamentType = tournamentType;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
