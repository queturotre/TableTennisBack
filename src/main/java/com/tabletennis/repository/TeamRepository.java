package com.tabletennis.repository;

import com.tabletennis.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    @Query("SELECT t FROM Team t WHERE t.tournament.idTournament = :tournamentId")
    List<Team> findByTournamentId(@Param("tournamentId") Integer tournamentId);

    @Query("SELECT t FROM Team t " +
            "WHERE t.tournament.idTournament = :tournamentId " +
            "AND (t.playerA.idPlayer = :playerId " +
            "OR t.playerB.idPlayer = :playerId " +
            "OR t.playerC.idPlayer = :playerId)")
    Optional<Team> findByTournamentAndPlayer(
            @Param("tournamentId") Integer tournamentId,
            @Param("playerId") Integer playerId);
}