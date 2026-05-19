package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Sequential increment
    @Column(name = "idCoach", nullable = false)
    private Integer idCoach;

    @ManyToOne // Many Coaches to only one club
    @JoinColumn(name = "idClub", nullable = false)
    private Club club;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public Coach(){}
}
