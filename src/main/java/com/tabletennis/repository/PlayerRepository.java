package com.tabletennis.repository;

import com.tabletennis.DTO.PlayerDTO;
import com.tabletennis.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer>{
    @Query("SELECT new com.tabletennis.DTO.PlayerDTO(" +
            "p.idPlayer, " +
            "p.name, p.height, p.weight, " +
            "p.gender, c.name, " +
            "CONCAT(b.brand, ' ', b.model), " +
            "CONCAT(br.brand, ' ', br.model), " +
            "CONCAT(cr.brand, ' ', cr.model), " +
            "co.name, p.advtg, p.hand) " +
            "FROM Player p " +
            "JOIN p.club c " +
            "JOIN p.blade b " +
            "JOIN p.blackRubber br " +
            "JOIN p.coloredRubber cr " +
            "JOIN p.coach co")
    List<PlayerDTO> findAllPlayers();
}
