package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Plant;
import com.upr.botanicalGarden.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public List<Plant> findAll() {
        //return plantRepository.findAll();
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant());
        return plants;
    }

    public Plant save(Plant candidate) {
        return plantRepository.save(candidate);
    }

    public Optional<Plant> findById(long id) {
        return plantRepository.findById(id);
    }
}
