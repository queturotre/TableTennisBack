package com.tabletennis.service;

import com.tabletennis.DTO.BladeDTO;
import com.tabletennis.DTO.BladeResponseDTO;
import com.tabletennis.entity.Blade;
import com.tabletennis.repository.BladeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BladeService {
    private final BladeRepository bladeRepository;

    @Autowired
    public BladeService(BladeRepository bladeRepository) {
        this.bladeRepository = bladeRepository;
    }

    @Transactional(readOnly = true)
    public List<BladeDTO> getAllBlades() {
        return bladeRepository.findAllBlades();
    }

    @Transactional
    public BladeResponseDTO createBlade(BladeResponseDTO dto){
        checkData(dto);

        Blade blade = new Blade();

        blade.setBrand(dto.getBrand());
        blade.setModel(dto.getModel());

        bladeRepository.save(blade);

        return new BladeResponseDTO(
            blade.getBrand(),
            blade.getModel()
        );
    }

    @Transactional
    public void deleteBlade(Integer id){
        bladeRepository.deleteById(id);
    }

    @Transactional
    public void updateBlade(Integer id, BladeResponseDTO dto){
        checkData(dto);

        Blade blade = bladeRepository.findById(id).orElseThrow(() -> new RuntimeException("Blade not found"));

        blade.setBrand(dto.getBrand());
        blade.setModel(dto.getModel());

        bladeRepository.save(blade);
    }

    private void checkData(BladeResponseDTO dto){
        if(dto.getBrand() == null || dto.getBrand().trim().isEmpty()){
            throw new IllegalArgumentException("Brand is required");
        }

        if(dto.getModel() == null || dto.getModel().trim().isEmpty()){
            throw new IllegalArgumentException("Model is required");
        }
    }
}
