package com.tabletennis.service;

import com.tabletennis.DTO.CreateTournamentDTO;
import com.tabletennis.DTO.TournamentDetailDTO;
import com.tabletennis.DTO.TournamentListDTO;
import com.tabletennis.entity.*;
import com.tabletennis.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;
    private final TournamentStructureRepository structureRepository;
    private final TournamentTypeRepository typeRepository;
    private final ModalityRepository modalityRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public TournamentService(
        TournamentRepository tournamentRepository,
        TournamentStructureRepository structureRepository,
        TournamentTypeRepository typeRepository,
        ModalityRepository modalityRepository,
        CategoryRepository categoryRepository
    ) {
        this.tournamentRepository = tournamentRepository;
        this.structureRepository = structureRepository;
        this.typeRepository = typeRepository;
        this.modalityRepository = modalityRepository;
        this.categoryRepository = categoryRepository;
    }

    @Transactional(readOnly = true)
    public List<TournamentListDTO> getAllTournamentsWithDetails() {
        return tournamentRepository.findAllTournamentsWithDetails();
    }

    @Transactional
    public Tournament createTournament(CreateTournamentDTO dto) {
        // Fetch entities from database
        TournamentType type = typeRepository.findById(dto.getIdType())
                .orElseThrow(() -> new RuntimeException("Tournament type not found"));

        Modality modality = modalityRepository.findById(dto.getIdModality())
                .orElseThrow(() -> new RuntimeException("Modality not found"));

        Category category = categoryRepository.findById(dto.getIdCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        // Create and save TournamentStructure first
        TournamentStructure structure = new TournamentStructure();
        structure.setTournamentType(type);
        structure.setModality(modality);
        structure.setCategory(category);
        structure = structureRepository.save(structure);

        // Create and save a Tournament
        Tournament tournament = new Tournament();
        tournament.setName(dto.getName());
        tournament.setDescription(dto.getDescription());
        tournament.setTournamentType(type);
        tournament.setStructure(structure);
        tournament.setWinner(null);

        return tournamentRepository.save(tournament);
    }

    @Transactional
    public void deleteTournament(int idTournament) {
        tournamentRepository.deleteById(idTournament);
    }

//    @Transactional
//    public void deleteTournamentWithStructure(int idTournament) {
//        Tournament tournament = tournamentRepository.findById(idTournament)
//                .orElseThrow(() -> new RuntimeException("Tournament not found"));
//
//        structureRepository.deleteById(tournament.getStructure().getId());
//        tournamentRepository.deleteById(idTournament);
//    }

    @Transactional(readOnly = true)
    public TournamentDetailDTO getTournamentById(int idTournament) {
        return tournamentRepository.findTournamentDetailById(idTournament)
                .orElseThrow(() -> new RuntimeException("Tournament not found"));
    }
}
