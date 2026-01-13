package com.tabletennis.DTO;

public class CategoryDTO {
    private int id;
    private String category;

    public CategoryDTO(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public CategoryDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return category;
    }

    public void setType(String category) {
        this.category = category;
    }
}