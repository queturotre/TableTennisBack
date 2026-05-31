package com.tabletennis.DTO.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BladeDTO {
    private int idBlade;
    private String brand;
    private String model;

    public BladeDTO(int idBlade, String brand, String model) {
        this.idBlade = idBlade;
        this.brand = brand;
        this.model = model;
    }
}