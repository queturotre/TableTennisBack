package com.tabletennis.DTO.catalog;

import lombok.*;

@Getter
@Setter
public class UpdateRubberDTO {
    private String brand;
    private String model;
    private String code;

    public UpdateRubberDTO (String brand, String model, String code){
        this.brand = brand;
        this.model = model;
        this.code = code;
    }
}
