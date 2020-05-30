package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Hierarchy;
import com.upr.botanicalGarden.model.Localisation;
import com.upr.botanicalGarden.repository.HierarchyRepository;
import com.upr.botanicalGarden.repository.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HierarchyService {
    @Autowired
    private HierarchyRepository hierarchyRepository;

    public List<Hierarchy> findAll() {
        return hierarchyRepository.findAll();
    }

    public Hierarchy save(Hierarchy candidate) {
        return hierarchyRepository.save(candidate);
    }

    public Optional<Hierarchy> findById(long id) {
        return hierarchyRepository.findById(id);
    }
}
