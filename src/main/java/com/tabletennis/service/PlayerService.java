package com.tabletennis.service;

import com.tabletennis.DTO.PlayerDTO;
import com.tabletennis.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Transactional(readOnly = true)
    public List<PlayerDTO> findAllPlayers() {
        return playerRepository.findAllPlayers();
    }
}
