package com.tabletennis.service;

import com.tabletennis.DTO.ModalityDTO;
import com.tabletennis.repository.ModalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ModalityService {
    private final ModalityRepository modalityRepository;

    @Autowired
    public ModalityService(ModalityRepository modalityRepository) {
        this.modalityRepository = modalityRepository;
    }

    @Transactional(readOnly = true)
    public List<ModalityDTO> getAllModalities() {
        return modalityRepository.findAllModalities();
    }
}
