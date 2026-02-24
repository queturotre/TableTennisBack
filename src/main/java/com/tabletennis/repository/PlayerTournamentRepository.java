package com.tabletennis.repository;

import com.tabletennis.entity.PlayerTournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface PlayerTournamentRepository extends JpaRepository<PlayerTournament, PlayerTournament.PlayerTournamentId> {
    @Modifying
    @Query("DELETE FROM PlayerTournament pt WHERE pt.player.idPlayer = :playerId AND pt.tournament.idTournament = :tournamentId")
    void removePlayerFromTournament(@Param("playerId") Integer playerId, @Param("tournamentId") Integer tournamentId);
}
