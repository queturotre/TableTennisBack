package com.tabletennis.service;

import com.tabletennis.DTO.RubberDTO;
import com.tabletennis.entity.Rubber;
import com.tabletennis.repository.RubberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RubberService {
    private final RubberRepository rubberRepository;

    @Autowired
    public RubberService(RubberRepository rubberRepository) {
        this.rubberRepository = rubberRepository;
    }

    @Transactional
    public List<RubberDTO> findAllRubbers(){
        return rubberRepository.findAllRubbers();
    }

    @Transactional
    public RubberDTO createRubber(RubberDTO dto){
        if(dto.getBrand() == null){
            throw new RuntimeException("Brand is mandatory");
        }

        if(dto.getModel() == null){
            throw new RuntimeException("Model id is mandatory");
        }

        Rubber rubber = new Rubber();
        rubber.setBrand(dto.getBrand());
        rubber.setModel(dto.getModel());
        rubber.setCode(dto.getCode());

        rubberRepository.save(rubber);

        return new RubberDTO(
            rubber.getIdRubber(),
            rubber.getBrand(),
            rubber.getModel(),
            rubber.getCode()
        );
    }

    @Transactional
    public void deleteRubber(Integer id){
        rubberRepository.deleteById(id);
    }
}
