package com.tabletennis.repository;

import com.tabletennis.entity.TournamentStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentStructureRepository extends JpaRepository<TournamentStructure, Integer> {

}
