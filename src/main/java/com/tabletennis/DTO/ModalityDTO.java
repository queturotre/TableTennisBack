package com.tabletennis.DTO;

public class ModalityDTO {
    private int id;
    private String modality;

    public ModalityDTO(int id, String modality) {
        this.id = id;
        this.modality = modality;
    }

    public ModalityDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}
