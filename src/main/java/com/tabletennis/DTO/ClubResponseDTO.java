package com.tabletennis.DTO;

public class ClubResponseDTO {
    private Integer idClub;
    private String name;
    private String delegate;

    public ClubResponseDTO(Integer idClub, String name, String delegate) {
        this.idClub = idClub;
        this.name = name;
        this.delegate = delegate;
    }

    public ClubResponseDTO() {}

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }
}
