package com.tabletennis.DTO;

public class RubberDTO {
    private Integer id;
    private String brand;
    private String model;
    private String code;

    public RubberDTO(Integer id, String brand, String model, String code) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.code = code;
    }

    public RubberDTO() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }
}
