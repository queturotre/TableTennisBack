package com.tabletennis.DTO;

public class PlayerDetailDTO {
    private Integer idPlayer;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;
    private Integer advtg;
    private String hand;

    private String club;
    private String bladeName;
    private String blackRubberName;
    private String coloredRubberName;
    private String coach;

    private Integer idClub;
    private Integer idBlade;
    private Integer idBlackRubber;
    private Integer idColoredRubber;
    private Integer idCoach;

    public PlayerDetailDTO() {}

    public PlayerDetailDTO(
            Integer idPlayer, String name, Integer height, Integer weight,
            String gender, Integer advtg, String hand,
            String club, String bladeName, String blackRubberName,
            String coloredRubberName, String coach,
            Integer idClub, Integer idBlade, Integer idBlackRubber,
            Integer idColoredRubber, Integer idCoach
    ) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.advtg = advtg;
        this.hand = hand;
        this.club = club;
        this.bladeName = bladeName;
        this.blackRubberName = blackRubberName;
        this.coloredRubberName = coloredRubberName;
        this.coach = coach;
        this.idClub = idClub;
        this.idBlade = idBlade;
        this.idBlackRubber = idBlackRubber;
        this.idColoredRubber = idColoredRubber;
        this.idCoach = idCoach;
    }

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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getBladeName() {
        return bladeName;
    }

    public void setBladeName(String bladeName) {
        this.bladeName = bladeName;
    }

    public String getBlackRubberName() {
        return blackRubberName;
    }

    public void setBlackRubberName(String blackRubberName) {
        this.blackRubberName = blackRubberName;
    }

    public String getColoredRubberName() {
        return coloredRubberName;
    }

    public void setColoredRubberName(String coloredRubberName) {
        this.coloredRubberName = coloredRubberName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public Integer getIdBlade() {
        return idBlade;
    }

    public void setIdBlade(Integer idBlade) {
        this.idBlade = idBlade;
    }

    public Integer getIdBlackRubber() {
        return idBlackRubber;
    }

    public void setIdBlackRubber(Integer idBlackRubber) {
        this.idBlackRubber = idBlackRubber;
    }

    public Integer getIdColoredRubber() {
        return idColoredRubber;
    }

    public void setIdColoredRubber(Integer idColoredRubber) {
        this.idColoredRubber = idColoredRubber;
    }

    public Integer getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(Integer idCoach) {
        this.idCoach = idCoach;
    }
}