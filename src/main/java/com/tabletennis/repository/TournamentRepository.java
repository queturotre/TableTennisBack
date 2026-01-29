package com.tabletennis.repository;

import com.tabletennis.DTO.TournamentDetailDTO;
import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Query("SELECT new com.tabletennis.DTO.TournamentDetailDTO(" +
            "t.idTournament, t.name, tt.name, m.name, c.name, t.description) " +
            "FROM Tournament t " +
            "JOIN t.structure ts " +
            "JOIN ts.tournamentType tt " +
            "JOIN ts.modality m " +
            "JOIN ts.category c " +
            "WHERE t.idTournament = :id")
    Optional<TournamentDetailDTO> findTournamentDetailById(@Param("id") Integer id);
}