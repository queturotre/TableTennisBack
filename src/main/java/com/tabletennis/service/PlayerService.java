package com.tabletennis.service;

import com.tabletennis.DTO.CreatePlayerDTO;
import com.tabletennis.DTO.PlayerDTO;
import com.tabletennis.DTO.PlayerDetailDTO;
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
    private final TournamentRepository tournamentRepository;
    private final PlayerTournamentRepository playerTournamentRepository;

    @Autowired
    public PlayerService(
        PlayerRepository playerRepository,
        ClubRepository clubRepository,
        BladeRepository bladeRepository,
        RubberRepository rubberRepository,
        CoachRepository coachRepository,
        TournamentRepository tournamentRepository,
        PlayerTournamentRepository playerTournamentRepository
    ) {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
        this.bladeRepository = bladeRepository;
        this.rubberRepository = rubberRepository;
        this.coachRepository = coachRepository;
        this.tournamentRepository = tournamentRepository;
        this.playerTournamentRepository = playerTournamentRepository;
    }

    @Transactional(readOnly = true)
    public List<PlayerDTO> findAllPlayers() {
        return playerRepository.findAllPlayers();
    }

    @Transactional(readOnly = true)
    public PlayerDetailDTO getPlayerById(Integer id) {
        return playerRepository.findPlayerDetailById(id)
                .orElseThrow(() -> new RuntimeException("Player not found"));
    }

    @Transactional
    public Player createPlayer(CreatePlayerDTO dto) {
        if (dto.getName() == null || dto.getName().trim().isEmpty()) {
            throw new RuntimeException("Player name is required");
        }

        Club club = null;
        if (dto.getClub() != null) {
            club = clubRepository.findById(dto.getClub())
                    .orElseThrow(() -> new RuntimeException("Club not found"));
        }

        Blade blade = null;
        if (dto.getBlade() != null) {
            blade = bladeRepository.findById(dto.getBlade())
                    .orElseThrow(() -> new RuntimeException("Blade not found"));
        }

        Rubber blackRubber = null;
        if (dto.getBlackRubber() != null) {
            blackRubber = rubberRepository.findById(dto.getBlackRubber())
                    .orElseThrow(() -> new RuntimeException("Black rubber not found"));
        }

        Rubber coloredRubber = null;
        if (dto.getColoredRubber() != null) {
            coloredRubber = rubberRepository.findById(dto.getColoredRubber())
                    .orElseThrow(() -> new RuntimeException("Colored rubber not found"));
        }

        Coach coach = null;
        if (dto.getCoach() != null) {
            coach = coachRepository.findById(dto.getCoach())
                    .orElseThrow(() -> new RuntimeException("Coach not found"));
        }

        Player player = new Player();
        player.setName(dto.getName());
        player.setHeight(dto.getHeight());
        player.setWeight(dto.getWeight());
        player.setGender(dto.getGender());
        player.setAdvtg(dto.getAdvtg());
        player.setHand(dto.getHand());
        player.setClub(club);
        player.setBlade(blade);
        player.setBlackRubber(blackRubber);
        player.setColoredRubber(coloredRubber);
        player.setCoach(coach);

        player = playerRepository.save(player);

        if (dto.getIdTournament() != null) {
            Tournament tournament = tournamentRepository.findById(dto.getIdTournament()) // Must be
                    .orElseThrow(() -> new RuntimeException("Tournament not found"));

            PlayerTournament playerTournament = new PlayerTournament();
            playerTournament.setPlayer(player);
            playerTournament.setTournament(tournament);
            playerTournament.setGamesPlayed(0);
            playerTournament.setPointsWon(0);
            playerTournament.setPointsLost(0);
            playerTournament.setSetsWon(0);
            playerTournament.setSetsLost(0);
            playerTournament.setMatchesWon(0);
            playerTournament.setMatchesLost(0);
            playerTournament.setYellowCards(0);
            playerTournament.setYellowRedCards(0);
            playerTournament.setTimeOuts(0);
            playerTournament.setPointsWonOnService(0);
            playerTournament.setPointsLostOnService(0);
            playerTournament.setPointsWonOnReceive(0);
            playerTournament.setPointsLostOnReceive(0);

            playerTournamentRepository.save(playerTournament);
        }

        return player;
    }

    @Transactional
    public PlayerDetailDTO updatePlayer(Integer id, CreatePlayerDTO dto) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Player not found"));

        player.setName(dto.getName());
        player.setHeight(dto.getHeight());
        player.setWeight(dto.getWeight());
        player.setGender(dto.getGender());
        player.setAdvtg(dto.getAdvtg());
        player.setHand(dto.getHand());

        if (dto.getClub() != null) {
            Club club = clubRepository.findById(dto.getClub())
                    .orElseThrow(() -> new RuntimeException("Club not found"));
            player.setClub(club);
        } else {
            player.setClub(null);
        }

        if (dto.getBlade() != null) {
            Blade blade = bladeRepository.findById(dto.getBlade())
                    .orElseThrow(() -> new RuntimeException("Blade not found"));
            player.setBlade(blade);
        } else {
            player.setBlade(null);
        }

        if (dto.getBlackRubber() != null) {
            Rubber blackRubber = rubberRepository.findById(dto.getBlackRubber())
                    .orElseThrow(() -> new RuntimeException("Black rubber not found"));
            player.setBlackRubber(blackRubber);
        } else {
            player.setBlackRubber(null);
        }

        if (dto.getColoredRubber() != null) {
            Rubber coloredRubber = rubberRepository.findById(dto.getColoredRubber())
                    .orElseThrow(() -> new RuntimeException("Colored rubber not found"));
            player.setColoredRubber(coloredRubber);
        } else {
            player.setColoredRubber(null);
        }

        if (dto.getCoach() != null) {
            Coach coach = coachRepository.findById(dto.getCoach())
                    .orElseThrow(() -> new RuntimeException("Coach not found"));
            player.setCoach(coach);
        } else {
            player.setCoach(null);
        }

        playerRepository.save(player);

        return getPlayerById(id);
    }

    @Transactional(readOnly = true)
    public List<PlayerDTO> findPlayerByTournamentId(int idTournament) {
        return playerRepository.findPlayersByTournament(idTournament);
    }

    @Transactional
    public void removePlayerFromTournament(Integer playerId, Integer tournamentId) {
        playerRepository.findById(playerId)
            .orElseThrow(() -> new RuntimeException("Player not found"));

        tournamentRepository.findById(tournamentId)
            .orElseThrow(() -> new RuntimeException("Tournament not found"));

        playerTournamentRepository.removePlayerFromTournament(playerId, tournamentId);
    }
}
