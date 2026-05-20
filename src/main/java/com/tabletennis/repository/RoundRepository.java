package com.tabletennis.repository;

import com.tabletennis.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoundRepository extends JpaRepository<Round, Integer> {

    @Query("SELECT r FROM Round r WHERE r.tournament.idTournament = :tournamentId ORDER BY r.roundOrder")
    List<Round> findByTournamentIdOrderByRoundOrder(@Param("tournamentId") Integer tournamentId);

    @Query("SELECT COUNT(r) FROM Round r WHERE r.tournament.idTournament = :tournamentId")
    int countByTournamentId(@Param("tournamentId") Integer tournamentId);
}