package com.tabletennis.DTO;

public class CreatePlayerDTO {
    private String name;
    private int weight;
    private int height;
    private String gender;
    private int advtg;
    private int idClub;
    private int idBlade;
    private int idBlackRubber;
    private int idColoredRubber;
    private int idCoach;
    private String hand;

    public CreatePlayerDTO(
            String name, int weight, int height,
            String gender, int advtg, int idClub,
            int idBlade, int idBlackRubber,
            int idColoredRubber, int idCoach, String hand
    ) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.advtg = advtg;
        this.idClub = idClub;
        this.idBlade = idBlade;
        this.idBlackRubber = idBlackRubber;
        this.idColoredRubber = idColoredRubber;
        this.idCoach = idCoach;
        this.hand = hand;
    }

    public CreatePlayerDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAdvtg() {
        return advtg;
    }

    public void setAdvtg(int advtg) {
        this.advtg = advtg;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public int getIdBlade() {
        return idBlade;
    }

    public void setIdBlade(int idBlade) {
        this.idBlade = idBlade;
    }

    public int getIdBlackRubber() {
        return idBlackRubber;
    }

    public void setIdBlackRubber(int idBlackRubber) {
        this.idBlackRubber = idBlackRubber;
    }

    public int getIdColoredRubber() {
        return idColoredRubber;
    }

    public void setIdColoredRubber(int idColoredRubber) {
        this.idColoredRubber = idColoredRubber;
    }

    public int getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(int idCoach) {
        this.idCoach = idCoach;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }
}
