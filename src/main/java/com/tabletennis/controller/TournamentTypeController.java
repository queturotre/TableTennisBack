package com.tabletennis.controller;

import com.tabletennis.DTO.TournamentTypeDTO;
import com.tabletennis.service.TournamentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/tournament-types")
public class TournamentTypeController {

    private final TournamentTypeService tournamentTypeService;

    @Autowired
    public TournamentTypeController(TournamentTypeService tournamentTypeService) {
        this.tournamentTypeService = tournamentTypeService;
    }

    @GetMapping
    public ResponseEntity<List<TournamentTypeDTO>> getAllTournamentTypes() {
        List<TournamentTypeDTO> types = tournamentTypeService.getAllTournamentTypes();
        return ResponseEntity.ok(types);
    }
}
