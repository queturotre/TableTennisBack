package com.tabletennis.controller;

import com.tabletennis.DTO.RubberDTO;
import com.tabletennis.service.RubberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
