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

    public String getType() {
        return modality;
    }

    public void setType(String modality) {
        this.modality = modality;
    }
}
