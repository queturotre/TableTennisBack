package com.tabletennis.service;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.entity.Club;
import com.tabletennis.entity.Coach;
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
    public Coach createCoach(CoachDTO dto){
        Coach coach = new Coach();

        Club club = null;
        if (dto.getIdClub() != null) {
            club = clubRepository.findById(dto.getIdClub())
                .orElseThrow(() -> new RuntimeException("Club not found"));
        }

        coach.setClub(club);
        coach.setName(dto.getName());

        coachRepository.save(coach);

        return coach;
    }
}
