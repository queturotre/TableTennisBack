package com.tabletennis.repository;

import com.tabletennis.entity.PlayerGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerGameRepository extends JpaRepository<PlayerGame, PlayerGame.PlayerGameId> {

    @Query("SELECT pg FROM PlayerGame pg WHERE pg.game.idGame = :gameId")
    List<PlayerGame> findByGameId(@Param("gameId") Integer gameId);

    @Query("SELECT pg FROM PlayerGame pg " +
            "WHERE pg.player.idPlayer = :playerId AND pg.game.idGame = :gameId")
    Optional<PlayerGame> findByPlayerAndGame(
            @Param("playerId") Integer playerId,
            @Param("gameId") Integer gameId);

    @Query("SELECT pg FROM PlayerGame pg " +
            "WHERE pg.player.idPlayer = :playerId " +
            "AND pg.game.tournament.idTournament = :tournamentId")
    List<PlayerGame> findByPlayerAndTournament(
            @Param("playerId") Integer playerId,
            @Param("tournamentId") Integer tournamentId);

    @Modifying
    @Query("DELETE FROM PlayerGame pg WHERE pg.game.idGame = :gameId")
    void deleteByGameId(@Param("gameId") Integer gameId);
}