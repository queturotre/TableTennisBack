package com.tabletennis.service;

import com.tabletennis.DTO.CreatePlayerDTO;
import com.tabletennis.DTO.PlayerDTO;
import com.tabletennis.entity.*;
import com.tabletennis.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final ClubRepository clubRepository;
    private final BladeRepository bladeRepository;
    private final RubberRepository rubberRepository;
    private final CoachRepository coachRepository;

    @Autowired
    public PlayerService(
        PlayerRepository playerRepository,
        ClubRepository clubRepository,
        BladeRepository bladeRepository,
        RubberRepository rubberRepository,
        CoachRepository coachRepository
    ) {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
        this.bladeRepository = bladeRepository;
        this.rubberRepository = rubberRepository;
        this.coachRepository = coachRepository;
    }

    @Transactional(readOnly = true)
    public List<PlayerDTO> findAllPlayers() {
        return playerRepository.findAllPlayers();
    }

    @Transactional
    public Player createPlayer(CreatePlayerDTO dto) {
        // Foreign keys
        Club club = clubRepository.findById(dto.getClub())
                .orElseThrow(() -> new RuntimeException("Club not found"));

        Blade blade = bladeRepository.findById(dto.getBlade())
                .orElseThrow(() -> new RuntimeException("Blade not found"));

        Rubber blackRubber = rubberRepository.findById(dto.getBlackRubber())
                .orElseThrow(() -> new RuntimeException("Black rubber not found"));

        Rubber coloredRubber = rubberRepository.findById(dto.getColoredRubber())
                .orElseThrow(() -> new RuntimeException("Colored rubber not found"));

        Coach coach = coachRepository.findById(dto.getCoach())
                .orElseThrow(() -> new RuntimeException("Coach not found"));

        // Player object created
        Player player = new Player();
        player.setName(dto.getName());
        player.setHeight(dto.getHeight());
        player.setWeight(dto.getWeight());
        player.setGender(dto.getGender());
        player.setAdvtg(dto.getAdvtg());
        player.setHand(dto.getHand());

        //  Foreign keys set
        player.setClub(club);
        player.setBlade(blade);
        player.setBlackRubber(blackRubber);
        player.setColoredRubber(coloredRubber);
        player.setCoach(coach);

        return playerRepository.save(player);
    }

    @Transactional(readOnly = true)
    public List<PlayerDTO> findPlayerByTournamentId(int idTournament) {
        return playerRepository.findPlayersByTournament(idTournament);
    }

    
}
