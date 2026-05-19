package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idGame")
@Entity
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGame", nullable = false)
    private int idGame;

    @ManyToOne
    @JoinColumn(name = "idTournament", nullable = false)
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "idRound")
    private Round round;

    @ManyToOne
    @JoinColumn(name = "idHomePlayer", nullable = false)
    private Player homePlayer;

    @ManyToOne
    @JoinColumn(name = "idAwayPlayer", nullable = false)
    private Player awayPlayer;

    @ManyToOne
    @JoinColumn(name = "idUmpire")
    private User umpire;

    @ManyToOne
    @JoinColumn(name = "idAssistantUmpire")
    private User assistantUmpire;

    @ManyToOne
    @JoinColumn(name = "idRegisteredBy")
    private User registeredBy;

    @Column(name = "homePoints", nullable = false)
    private Integer homePoints = 0;

    @Column(name = "awayPoints", nullable = false)
    private Integer awayPoints = 0;

    @Column(name = "gameDate")
    private LocalDateTime gameDate;

    @Column(name = "court", nullable = false)
    private Integer court;

    @Column(name = "homeYellowCards", nullable = false)
    private Integer homeYellowCards = 0;

    @Column(name = "awayYellowCards", nullable = false)
    private Integer awayYellowCards = 0;

    @Column(name = "homeYellowRedCards", nullable = false)
    private Integer homeYellowRedCards = 0;

    @Column(name = "awayYellowRedCards", nullable = false)
    private Integer awayYellowRedCards = 0;

    @Column(name = "homeTimeOut", nullable = false)
    private Boolean homeTimeOut = false;

    @Column(name = "awayTimeOut", nullable = false)
    private Boolean awayTimeOut = false;

    @Column(name = "isWalkover", nullable = false)
    private Boolean isWalkover = false;

    @Column(name = "isPlayed", nullable = false)
    private Boolean isPlayed = false;
}