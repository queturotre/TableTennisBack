package com.tabletennis.repository;

import com.tabletennis.entity.TournamentStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface TournamentStructureRepository extends JpaRepository<TournamentStructure, Integer> {

    @Query("SELECT ts FROM TournamentStructure ts " +
            "WHERE ts.tournamentType.idType = :idType " +
            "AND ts.modality.idModality = :idModality " +
            "AND ts.category.idCategory = :idCategory")
    Optional<TournamentStructure> findByTypeModalityCategory(
            @Param("idType") int idType,
            @Param("idModality") int idModality,
            @Param("idCategory") int idCategory
    );
}