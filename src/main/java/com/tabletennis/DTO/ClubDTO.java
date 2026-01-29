package com.tabletennis.DTO;

public class ClubDTO {
    private int id;
    private String clubName;
    private String delegate;

    private ClubDTO(int id, String clubName, String delegate) {
        this.id = id;
        this.clubName = clubName;
        this.delegate = delegate;
    }

    private ClubDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(String delegate) {
        this.delegate = delegate;
    }
}
