package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "idPlayer")
@Table(name = "Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlayer", nullable = false)
    private int idPlayer;

    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "advtg")
    private Integer advtg;

    @Column(name = "hand", length = 10)
    private String hand;

    @ManyToOne
    @JoinColumn(name = "idClub")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "idBlade")
    private Blade blade;

    @ManyToOne
    @JoinColumn(name = "idBlackRubber")
    private Rubber blackRubber;

    @ManyToOne
    @JoinColumn(name = "idColoredRubber")
    private Rubber coloredRubber;

    @ManyToOne
    @JoinColumn(name = "idCoach")
    private Coach coach;
}
