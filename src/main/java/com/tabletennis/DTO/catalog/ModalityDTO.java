package com.tabletennis.DTO.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ModalityDTO {
    private int idModality;
    private String name;

    public ModalityDTO(int idModality, String name) {
        this.idModality = idModality;
        this.name = name;
    }
}