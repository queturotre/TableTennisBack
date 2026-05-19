package com.tabletennis.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"player", "group"})
@Entity
@Table(name = "PlayerGroup")
@IdClass(PlayerGroup.PlayerGroupId.class)
public class PlayerGroup {
    @Id
    @ManyToOne
    @JoinColumn(name = "idPlayer", nullable = false)
    private Player player;

    @Id
    @ManyToOne
    @JoinColumn(name = "idGroup", nullable = false)
    private TournamentGroup group;

    @Getter
    @Setter
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class PlayerGroupId implements Serializable {
        private int player;
        private int group;
    }
}