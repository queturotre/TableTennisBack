package com.tabletennis.repository;

import com.tabletennis.entity.TournamentDouble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TournamentDoubleRepository extends JpaRepository<TournamentDouble, Integer> {

    @Query("SELECT d FROM TournamentDouble d WHERE d.tournament.idTournament = :tournamentId")
    List<TournamentDouble> findByTournamentId(@Param("tournamentId") Integer tournamentId);

    @Query("SELECT d FROM TournamentDouble d " +
            "WHERE d.tournament.idTournament = :tournamentId " +
            "AND (d.playerA.idPlayer = :playerId OR d.playerB.idPlayer = :playerId)")
    Optional<TournamentDouble> findByTournamentAndPlayer(
            @Param("tournamentId") Integer tournamentId,
            @Param("playerId") Integer playerId
    );
}