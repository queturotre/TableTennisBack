package com.tabletennis.DTO;

public class PlayerDTO {
    private Integer idPlayer;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;
    private String club;
    private String blade;
    private String blackRubber;
    private String coloredRubber;
    private String coach;
    private Integer advtg;
    private String hand;

    public PlayerDTO(
        Integer idPlayer,
        String name, Integer height, Integer weight,
        String gender, String club, String blade,
        String blackRubber, String coloredRubber,
        String coach, Integer advtg, String hand
    ) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.advtg = advtg;
        this.club = club;
        this.blade = blade;
        this.blackRubber = blackRubber;
        this.coloredRubber = coloredRubber;
        this.coach = coach;
        this.hand = hand;
    }

    public PlayerDTO(){}

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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }

    public String getBlackRubber() {
        return blackRubber;
    }

    public void setBlackRubber(String blackRubber) {
        this.blackRubber = blackRubber;
    }

    public String getColoredRubber() {
        return coloredRubber;
    }

    public void setColoredRubber(String coloredRubber) {
        this.coloredRubber = coloredRubber;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
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
