package com.tabletennis.repository;

import com.tabletennis.DTO.ModalityDTO;
import com.tabletennis.entity.Modality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModalityRepository extends JpaRepository<Modality, Integer> {

    @Query("SELECT new com.tabletennis.DTO.ModalityDTO(m.idModality, m.name) " +
            "FROM Modality m")
    List<ModalityDTO> findAllModalities();
}