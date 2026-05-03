package com.tabletennis.DTO;

public class UpdateClubDTO {
    private String name;
    private String delegate;

    public UpdateClubDTO(String name, String delegate){
        this.name = name;
        this.delegate = delegate;
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
