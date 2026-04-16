package com.tabletennis.controller;

import com.tabletennis.DTO.ClubDTO;
import com.tabletennis.entity.Club;
import com.tabletennis.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/clubs")
public class ClubController {
    private final ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping
    public ResponseEntity<List<ClubDTO>> getAllClubs() {
        return ResponseEntity.ok(clubService.findAllClubs());
    }

    @PostMapping("/club")
    public ResponseEntity<Club> createClub(@RequestBody ClubDTO dto){
        try{
            Club club = clubService.createClub(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(club);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
