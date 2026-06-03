package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="Blade")
public class Blade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBlade", nullable = false)
    private int idBlade;

    @Column(name = "brand", length = 50)
    private String brand;

    @Column(name = "model", length = 50)
    private String model;

    public Blade(){}

}
