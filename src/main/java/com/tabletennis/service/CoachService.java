package com.tabletennis.service;

import com.tabletennis.DTO.CoachDTO;
import com.tabletennis.entity.Club;
import com.tabletennis.entity.Coach;
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

    @Transactional(readOnly = true)
    public List<CoachDTO> findCoachesByClubId(int idClub) {
        return coachRepository.findCoachesByClubId(idClub);
    }

    @Transactional
    public Coach createCoach(CoachDTO dto){
        Coach coach = new Coach();
        Club club = new Club();

        coach.setClub(club);
        coach.setName(dto.getName());

        coachRepository.save(coach);

        return coach;
    }
}
