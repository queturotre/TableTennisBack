package com.tabletennis.repository;

import com.tabletennis.entity.Blade;
import com.tabletennis.DTO.BladeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BladeRepository extends JpaRepository<Blade, Integer> {
    @Query("SELECT new com.tabletennis.DTO.BladeDTO(b.idBlade, b.brand, b.model) FROM Blade b")
    List<BladeDTO> findAllBlades();
}
