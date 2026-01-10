package com.tabletennis.controller;

import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/get-tournaments")
public class TournamentController {
    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping
    public ResponseEntity<List<TournamentListDTO>> getAllTournaments() {
        List<TournamentListDTO> tournaments = tournamentService.getAllTournamentsWithDetails();
        return ResponseEntity.ok(tournaments);
    }
}
