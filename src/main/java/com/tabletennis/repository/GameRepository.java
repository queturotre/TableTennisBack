package com.tabletennis.repository;

import com.tabletennis.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("SELECT g FROM Game g WHERE g.tournament.idTournament = :tournamentId")
    List<Game> findByTournamentId(@Param("tournamentId") Integer tournamentId);

    @Query("SELECT g FROM Game g WHERE g.round.idRound = :roundId")
    List<Game> findByRoundId(@Param("roundId") Integer roundId);

    @Query("SELECT g FROM Game g " +
            "WHERE g.tournament.idTournament = :tournamentId " +
            "AND (g.homePlayer.idPlayer = :playerId OR g.awayPlayer.idPlayer = :playerId)")
    List<Game> findByTournamentAndPlayer(
            @Param("tournamentId") Integer tournamentId,
            @Param("playerId") Integer playerId);

    @Query("SELECT g FROM Game g " +
            "WHERE g.tournament.idTournament = :tournamentId " +
            "AND g.isPlayed = false")
    List<Game> findPendingByTournamentId(@Param("tournamentId") Integer tournamentId);

    @Query("SELECT COUNT(g) FROM Game g " +
            "WHERE g.tournament.idTournament = :tournamentId " +
            "AND g.homePlayer.idPlayer = :playerId " +
            "AND g.awayPlayer.idPlayer = :rivalId")
    int alreadyPlayed(
            @Param("tournamentId") Integer tournamentId,
            @Param("playerId") Integer playerId,
            @Param("rivalId") Integer rivalId);
}