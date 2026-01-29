package com.tabletennis.controller;

import com.tabletennis.DTO.BladeDTO;
import com.tabletennis.service.BladeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/blades")
public class BladeController {
    private final BladeService bladeService;

    @Autowired
    public BladeController(BladeService bladeService) {
        this.bladeService = bladeService;
    }

    @GetMapping
    public ResponseEntity<List<BladeDTO>> getAllBlades() {
        return ResponseEntity.ok(bladeService.getAllBlades());
    }
}
