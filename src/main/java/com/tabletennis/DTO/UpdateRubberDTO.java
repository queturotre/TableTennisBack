package com.tabletennis.DTO;

public class UpdateRubberDTO {
    private String brand;
    private String model;
    private String code;

    public UpdateRubberDTO (String brand, String model, String code){
        this.brand = brand;
        this.model = model;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
