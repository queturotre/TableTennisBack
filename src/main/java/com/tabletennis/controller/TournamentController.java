package com.tabletennis.controller;

import com.tabletennis.DTO.CreateTournamentDTO;
import com.tabletennis.DTO.TournamentDetailDTO;
import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.entity.Tournament;
import com.tabletennis.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class TournamentController {
    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping("/tournaments")
    public ResponseEntity<List<TournamentListDTO>> getAllTournaments() {
        List<TournamentListDTO> tournaments = tournamentService.getAllTournamentsWithDetails();
        return ResponseEntity.ok(tournaments);
    }

    @PostMapping("/create-tournament")
    public ResponseEntity<Tournament> createTournament(@RequestBody CreateTournamentDTO dto) {
        try {
            Tournament tournament = tournamentService.createTournament(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(tournament);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/tournament-detail/{id}")
    public ResponseEntity<TournamentDetailDTO> getTournamentById(@PathVariable Integer id) {
        try {
            TournamentDetailDTO tournament = tournamentService.getTournamentById(id);
            return ResponseEntity.ok(tournament);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
