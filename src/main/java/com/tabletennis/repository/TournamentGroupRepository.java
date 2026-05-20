package com.tabletennis.repository;

import com.tabletennis.entity.TournamentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TournamentGroupRepository extends JpaRepository<TournamentGroup, Integer> {

    @Query("SELECT g FROM TournamentGroup g WHERE g.round.idRound = :roundId")
    List<TournamentGroup> findByRoundId(@Param("roundId") Integer roundId);
}