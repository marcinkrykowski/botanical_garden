package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Localisation;
import com.upr.botanicalGarden.repository.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalisationService {
    @Autowired
    private LocalisationRepository localisationRepository;

    public List<Localisation> findAll() {
        return localisationRepository.findAll();
    }

    public Localisation save(Localisation candidate) {
        return localisationRepository.save(candidate);
    }

    public Optional<Localisation> findById(long id) {
        return localisationRepository.findById(id);
    }
}
