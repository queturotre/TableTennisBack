package com.tabletennis.DTO.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RubberDTO {
    private Integer idRubber;
    private String brand;
    private String model;
    private String code;

    public RubberDTO(Integer idRubber, String brand, String model, String code) {
        this.idRubber = idRubber;
        this.brand = brand;
        this.model = model;
        this.code = code;
    }
}