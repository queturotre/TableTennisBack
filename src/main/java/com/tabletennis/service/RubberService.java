package com.tabletennis.service;

import com.tabletennis.DTO.RubberDTO;
import com.tabletennis.repository.RubberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RubberService {
    private final RubberRepository rubberRepository;

    @Autowired
    public RubberService(RubberRepository rubberRepository) {
        this.rubberRepository = rubberRepository;
    }

    @Transactional
    public List<RubberDTO> findAllRubbers(){
        return rubberRepository.findAllRubbers();
    }
}
