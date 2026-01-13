package com.tabletennis.repository;

import com.tabletennis.DTO.TournamentTypeDTO;
import com.tabletennis.entity.TournamentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TournamentTypeRepository extends JpaRepository<TournamentType, Integer> {

    @Query("SELECT new com.tabletennis.DTO.TournamentTypeDTO(tt.idType, tt.name) " +
            "FROM TournamentType tt")
    List<TournamentTypeDTO> findAllTournamentTypes();
}