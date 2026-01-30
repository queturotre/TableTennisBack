package com.tabletennis.service;

import com.tabletennis.DTO.TournamentTypeDTO;
import com.tabletennis.repository.TournamentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TournamentTypeService {
    private final TournamentTypeRepository tournamentTypeRepository;

    @Autowired
    public TournamentTypeService(TournamentTypeRepository tournamentTypeRepository) {
        this.tournamentTypeRepository = tournamentTypeRepository;
    }

    @Transactional(readOnly = true)
    public List<TournamentTypeDTO> getAllTournamentTypes() {
        return tournamentTypeRepository.findAllTournamentTypes();
    }
}
