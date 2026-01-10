package com.tabletennis.service;

import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;

    @Autowired
    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Transactional(readOnly = true)
    public List<TournamentListDTO> getAllTournamentsWithDetails() {
        return tournamentRepository.findAllTournamentsWithDetails();
    }
}
