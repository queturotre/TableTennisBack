package com.tabletennis.controller;

import com.tabletennis.DTO.RubberDTO;
import com.tabletennis.DTO.UpdateRubberDTO;
import com.tabletennis.service.RubberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/user")
public class RubberController {
    private final RubberService rubberService;

    @Autowired
    public RubberController(RubberService rubberService) {
        this.rubberService = rubberService;
    }

    @GetMapping("/rubbers")
    public ResponseEntity<List<RubberDTO>> getAllRubbers() {
        return ResponseEntity.ok(rubberService.findAllRubbers());
    }

    @PostMapping("/rubber")
    public ResponseEntity<RubberDTO> createRubber(@RequestBody RubberDTO dto){
        RubberDTO rubber = rubberService.createRubber(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(rubber);
    }

    @DeleteMapping("/rubber/{id}")
    public ResponseEntity<Void> deleteRubber(@PathVariable Integer id){
        rubberService.deleteRubber(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/rubber/{id}")
    public ResponseEntity<RubberDTO> updateRubber(@PathVariable Integer id, @RequestBody UpdateRubberDTO dto){
        UpdateRubberDTO updated = rubberService.updateRubber(dto, id);
        return ResponseEntity.noContent().build();
    }
}
