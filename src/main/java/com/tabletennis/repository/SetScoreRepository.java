package com.tabletennis.repository;

import com.tabletennis.entity.SetScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SetScoreRepository extends JpaRepository<SetScore, Integer> {

    @Query("SELECT s FROM SetScore s WHERE s.game.idGame = :gameId ORDER BY s.setNumber")
    List<SetScore> findByGameIdOrderBySetNumber(@Param("gameId") Integer gameId);

    @Modifying
    @Query("DELETE FROM SetScore s WHERE s.game.idGame = :gameId")
    void deleteByGameId(@Param("gameId") Integer gameId);
}