package com.tabletennis.repository;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoachRepository extends JpaRepository<Coach, Integer> {
    @Query("""
           SELECT new com.tabletennis.DTO.CoachDTO(c.idCoach, c.club.idClub, c.name)
           FROM Coach c
           """)
    List<CoachDTO> findAllCoaches();
}
