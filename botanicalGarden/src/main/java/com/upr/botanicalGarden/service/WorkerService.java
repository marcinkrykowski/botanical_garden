package com.upr.botanicalGarden.service;

import com.upr.botanicalGarden.model.Worker;
import com.upr.botanicalGarden.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker save(Worker candidate) {
        return workerRepository.save(candidate);
    }

    public Optional<Worker> findById(long id) {
        return workerRepository.findById(id);
    }
}
