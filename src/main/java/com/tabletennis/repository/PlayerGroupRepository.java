package com.tabletennis.repository;

import com.tabletennis.entity.PlayerGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerGroupRepository extends JpaRepository<PlayerGroup, PlayerGroup.PlayerGroupId> {

    @Query("SELECT pg FROM PlayerGroup pg WHERE pg.group.idGroup = :groupId")
    List<PlayerGroup> findByGroupId(@Param("groupId") Integer groupId);

    @Query("SELECT pg FROM PlayerGroup pg WHERE pg.player.idPlayer = :playerId")
    List<PlayerGroup> findByPlayerId(@Param("playerId") Integer playerId);

    @Modifying
    @Query("DELETE FROM PlayerGroup pg WHERE pg.player.idPlayer = :playerId AND pg.group.idGroup = :groupId")
    void removePlayerFromGroup(@Param("playerId") Integer playerId, @Param("groupId") Integer groupId);
}