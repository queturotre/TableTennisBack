package com.tabletennis.controller;

import com.tabletennis.DTO.BladeDTO;
import com.tabletennis.DTO.BladeResponseDTO;
import com.tabletennis.service.BladeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class BladeController {
    private final BladeService bladeService;

    @Autowired
    public BladeController(BladeService bladeService) {
        this.bladeService = bladeService;
    }

    @GetMapping("blades")
    public ResponseEntity<List<BladeDTO>> getAllBlades() {
        return ResponseEntity.ok(bladeService.getAllBlades());
    }

    @PostMapping("blade")
    public ResponseEntity<BladeResponseDTO> createBlade(@RequestBody BladeResponseDTO dto){
        BladeResponseDTO blade = bladeService.createBlade(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(blade);
    }

    @DeleteMapping("blade/{id}")
    public ResponseEntity<Void> deleteBlade(@PathVariable Integer id){
        bladeService.deleteBlade(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("blade/{id}")
    public ResponseEntity<Void> updateBlade(@PathVariable Integer id, @RequestBody BladeResponseDTO dto){
        bladeService.updateBlade(id, dto);
        return ResponseEntity.noContent().build();
    }
}
