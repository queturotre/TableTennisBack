package com.tabletennis.repository;

import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

    @Query("SELECT new com.tabletennis.DTO.TournamentListDTO(" +
            "t.idTournament, t.name, tt.name, m.name, c.name) " +
            "FROM Tournament t " +
            "JOIN t.structure ts " +
            "JOIN ts.tournamentType tt " +
            "JOIN ts.modality m " +
            "JOIN ts.category c")
    List<TournamentListDTO> findAllTournamentsWithDetails();
}