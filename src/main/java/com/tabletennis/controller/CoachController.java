package com.tabletennis.controller;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/user")
public class CoachController {
    private final CoachService coachService;

    @Autowired
    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping("/coaches")
    public ResponseEntity<List<CoachDTO>> getAllCoaches() {
        return ResponseEntity.ok(coachService.findAllCoaches());
    }

    @GetMapping("/coaches-by-club/{idClub}")
    public ResponseEntity<List<CoachDTO>> getCoachesByClub(@PathVariable int idClub) {
        return ResponseEntity.ok(coachService.findCoachesByClubId(idClub));
    }
}
