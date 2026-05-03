package com.tabletennis.DTO;

public class UpdateClubDTO {
    private String name;
    private String delegate;

    public UpdateClubDTO(String name, String delegate){
        this.name = name;
        this.delegate = delegate;
    }

    public String getClubName() {
        return name;
    }

    public void setClubName(String name) {
        this.name = name;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }
}
