package com.tabletennis.service;

import com.tabletennis.DTO.ClubDTO;
import com.tabletennis.DTO.ClubResponseDTO;
import com.tabletennis.entity.Club;
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

    @Transactional
    public ClubResponseDTO createClub(ClubDTO dto){
        if(dto.getClubName() == null || dto.getClubName().trim().isEmpty()){
            throw new IllegalArgumentException("Club name is required");
        }

        if (dto.getDelegate() == null || dto.getDelegate().trim().isEmpty()){
            throw new IllegalArgumentException("Club delegate is mandatory");
        }

        Club club = new Club();
        club.setName(dto.getClubName());
        club.setDelegate(dto.getDelegate());
        clubRepository.save(club);

        return new ClubResponseDTO( // Turning the response from entity to DTO
            club.getIdClub(),
            club.getName(),
            club.getDelegate()
        );
    }

    @Transactional
    public void deleteClub(Integer id){
        clubRepository.deleteById(id);
    }
}
