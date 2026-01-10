package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="Category")
public class Category {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory", nullable = false)
    private int idCategory;

    @Getter
    @Column(nullable = false, length = 30)
    private String name;

    @Column
    private Byte level;

    public Category(){}

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }
}
