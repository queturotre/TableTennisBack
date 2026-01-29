package com.tabletennis.repository;

import com.tabletennis.DTO.ClubDTO;
import com.tabletennis.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer>{
    @Query("SELECT new com.tabletennis.DTO.ClubDTO(c.idClub, c.name, c.delegate) FROM Club c")
    List<ClubDTO> findAllClubs();
}
