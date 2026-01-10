package com.tabletennis.entity;

import jakarta.persistence.*;

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

    public Player() {}

    // Getters and Setters
    public Integer getIdPlayer() {
        return idPlayer;
    }

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
}
