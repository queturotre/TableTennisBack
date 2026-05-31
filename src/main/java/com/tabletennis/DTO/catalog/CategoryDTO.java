package com.tabletennis.DTO.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CategoryDTO {
    private int idCategory;
    private String name;

    public CategoryDTO(int idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }
}