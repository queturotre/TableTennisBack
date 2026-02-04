package com.tabletennis.repository;

import com.tabletennis.entity.PlayerTournament;
import com.tabletennis.entity.TournamentStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTournamentRepository extends JpaRepository<PlayerTournament, PlayerTournament.PlayerTournamentId> {

}
