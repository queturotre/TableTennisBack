package com.tabletennis.service;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoachService {
    private final CoachRepository coachRepository;

    @Autowired
    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Transactional(readOnly = true)
    public List<CoachDTO> findAllCoaches() {
        return coachRepository.findAllCoaches();
    }
}
