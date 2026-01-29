package com.tabletennis.entity;

import jakarta.persistence.*;

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

    public int getIdBlade() {
        return idBlade;
    }

    public void setIdBlade(int idBlade) {
        this.idBlade = idBlade;
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
