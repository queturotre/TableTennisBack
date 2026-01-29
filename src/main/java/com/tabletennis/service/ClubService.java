package com.tabletennis.service;

import com.tabletennis.DTO.ClubDTO;
import com.tabletennis.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClubService {
    private final ClubRepository clubRepository;

    @Autowired
    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Transactional(readOnly = true)
    public List<ClubDTO> findAllClubs() {
        return clubRepository.findAllClubs();
    }
}
