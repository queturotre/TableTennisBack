package com.tabletennis.controller;

import com.tabletennis.DTO.CreatePlayerDTO;
import com.tabletennis.DTO.PlayerDTO;
import com.tabletennis.entity.Player;
import com.tabletennis.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers() {
        List<PlayerDTO> players = playerService.findAllPlayers();
        return ResponseEntity.ok(players);
    }

    @PostMapping("/create-player")
    public ResponseEntity<Player> createPlayer(@RequestBody CreatePlayerDTO dto){
        try {
            Player player = playerService.createPlayer(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(player);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
