package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="Club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClub", nullable = false)
    private int idClub;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "delegate", length = 30)
    private String delegate;

    public Club(){}
}
