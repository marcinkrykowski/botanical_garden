package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Chemical;
import com.upr.botanicalGarden.repository.ChemicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChemicalService {
    @Autowired
    private ChemicalRepository chemicalRepository;

    public List<Chemical> findAll() {
        return chemicalRepository.findAll();
    }

    public Chemical save(Chemical candidate) {
        return chemicalRepository.save(candidate);
    }

    public Optional<Chemical> findById(long id) {
        return chemicalRepository.findById(id);
    }
}
