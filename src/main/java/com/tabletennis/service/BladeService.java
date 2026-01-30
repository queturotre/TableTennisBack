package com.tabletennis.service;

import com.tabletennis.DTO.BladeDTO;
import com.tabletennis.repository.BladeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BladeService {
    private final BladeRepository bladeRepository;

    @Autowired
    public BladeService(BladeRepository bladeRepository) {
        this.bladeRepository = bladeRepository;
    }

    @Transactional(readOnly = true)
    public List<BladeDTO> getAllBlades() {
        return bladeRepository.findAllBlades();
    }
}
