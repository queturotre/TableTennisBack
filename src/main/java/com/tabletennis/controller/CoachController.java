package com.tabletennis.controller;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.DTO.CoachResponseDTO;
import com.tabletennis.DTO.CreateCoachDTO;
import com.tabletennis.entity.Coach;
import com.tabletennis.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/coach")
    public ResponseEntity<CoachResponseDTO> createCoach(@RequestBody CreateCoachDTO dto) {
        CoachResponseDTO coach = coachService.createCoach(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(coach);
    }

    @DeleteMapping("/coach/{id}")
    public ResponseEntity<Void> deleteCoach(@PathVariable Integer id){
        coachService.deleteCoach(id);
        return ResponseEntity.noContent().build();
    }
}
