package com.tabletennis.service;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.DTO.CoachResponseDTO;
import com.tabletennis.DTO.CreateCoachDTO;
import com.tabletennis.entity.Club;
import com.tabletennis.entity.Coach;
import com.tabletennis.exception.DuplicateResourceException;
import com.tabletennis.exception.ResourceNotFoundException;
import com.tabletennis.repository.ClubRepository;
import com.tabletennis.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoachService {
    private final CoachRepository coachRepository;
    private final ClubRepository clubRepository;

    @Autowired
    public CoachService(
        CoachRepository coachRepository,
        ClubRepository clubRepository
    ) {
        this.coachRepository = coachRepository;
        this.clubRepository = clubRepository;
    }

    @Transactional(readOnly = true)
    public List<CoachDTO> findAllCoaches() {
        return coachRepository.findAllCoaches();
    }

    @Transactional(readOnly = true)
    public List<CoachDTO> findCoachesByClubId(int idClub) {
        return coachRepository.findCoachesByClubId(idClub);
    }

    @Transactional
    public CoachResponseDTO createCoach(CreateCoachDTO dto){
        if (dto.getIdClub() == null){
            throw new RuntimeException("Club id is mandatory");
        }

        if (coachRepository.existsByName(dto.getName())) {
            throw new DuplicateResourceException("Coach with name '" + dto.getName() + "' already exists");
        }

        Club club = null;
        if (dto.getIdClub() != null) {
            club = clubRepository.findById(dto.getIdClub())
                .orElseThrow(() -> new ResourceNotFoundException("Club with ID: "+dto.getIdClub()+" not found"));
        }

        if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Coach name is required");
        }

        Coach coach = new Coach();
        coach.setName(dto.getName());
        coach.setClub(club);
        coachRepository.save(coach);

        return new CoachResponseDTO(
            coach.getIdCoach(),
            coach.getName(),
            club.getName()
        );
    }
}
