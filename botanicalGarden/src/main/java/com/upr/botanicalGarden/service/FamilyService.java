package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Family;
import com.upr.botanicalGarden.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {
    @Autowired
    private FamilyRepository familyRepository;

    public List<Family> findAll() {
        return familyRepository.findAll();
    }

    public Family save(Family candidate) {
        return familyRepository.save(candidate);
    }

    public Optional<Family> findById(long id) {
        return familyRepository.findById(id);
    }
}
