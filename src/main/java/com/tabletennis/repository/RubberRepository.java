package com.tabletennis.repository;

import com.tabletennis.DTO.RubberDTO;
import com.tabletennis.entity.Rubber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubberRepository extends JpaRepository<Rubber, Integer>{
    @Query("SELECT new com.tabletennis.DTO.RubberDTO(r.idRubber, r.brand, r.model) FROM Rubber r")
    List<RubberDTO> findAllRubbers();
}
