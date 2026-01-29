package com.tabletennis.DTO;

public class RubberDTO {
    private int id;
    private String brand;
    private String model;

    public RubberDTO(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public RubberDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
