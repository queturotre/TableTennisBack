package com.tabletennis.DTO;

public class CreatePlayerDTO {
    private Integer idPlayer;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;
    private Integer club;
    private Integer blade;
    private Integer blackRubber;
    private Integer coloredRubber;
    private Integer coach;
    private Integer advtg;
    private String hand;

    public CreatePlayerDTO(
        Integer idPlayer, String name, Integer height,
        Integer weight, String gender, Integer club,
        Integer blade, Integer blackRubber,
        Integer coloredRubber, Integer coach,
        Integer advtg, String hand
    ) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.club = club;
        this.blade = blade;
        this.blackRubber = blackRubber;
        this.coloredRubber = coloredRubber;
        this.coach = coach;
        this.advtg = advtg;
        this.hand = hand;
    }

    public CreatePlayerDTO(){}

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getClub() {
        return club;
    }

    public void setClub(Integer club) {
        this.club = club;
    }

    public Integer getBlade() {
        return blade;
    }

    public void setBlade(Integer blade) {
        this.blade = blade;
    }

    public Integer getBlackRubber() {
        return blackRubber;
    }

    public void setBlackRubber(Integer blackRubber) {
        this.blackRubber = blackRubber;
    }

    public Integer getColoredRubber() {
        return coloredRubber;
    }

    public void setColoredRubber(Integer coloredRubber) {
        this.coloredRubber = coloredRubber;
    }

    public Integer getCoach() {
        return coach;
    }

    public void setCoach(Integer coach) {
        this.coach = coach;
    }

    public Integer getAdvtg() {
        return advtg;
    }

    public void setAdvtg(Integer advtg) {
        this.advtg = advtg;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }
}
