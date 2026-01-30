package com.tabletennis.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Rubber")
public class Rubber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRubber", nullable = false)
    private int idRubber;

    @Column(length = 50)
    private String brand;

    @Column(length = 50)
    private String model;

    public Rubber(){}

    public int getIdRubber() {
        return idRubber;
    }

    public void setIdRubber(int idRubber) {
        this.idRubber = idRubber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
