package com.tabletennis.controller;

import com.tabletennis.DTO.ModalityDTO;
import com.tabletennis.service.ModalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/modalities")
public class ModalityController {

    private final ModalityService modalityService;

    @Autowired
    public ModalityController(ModalityService modalityService) {
        this.modalityService = modalityService;
    }

    @GetMapping
    public ResponseEntity<List<ModalityDTO>> getAllModalities() {
        return ResponseEntity.ok(modalityService.getAllModalities());
    }

}
