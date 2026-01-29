package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClub", nullable = false)
    private int idClub;

    @Column(name = "name")
    private String name;

    @Column(name = "delegate")
    private String delegate;

    public Club(){}

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }
}
