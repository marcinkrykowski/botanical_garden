package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Seed;
import com.upr.botanicalGarden.repository.SeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeedService {
    @Autowired
    private SeedRepository seedRepository;

    public List<Seed> findAll() {
        return seedRepository.findAll();
    }

    public Seed save(Seed candidate) {
        return seedRepository.save(candidate);
    }

    public Optional<Seed> findById(long id) {
        return seedRepository.findById(id);
    }
}
