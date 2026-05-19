package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
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
}
