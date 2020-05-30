package com.upr.botanicalGarden.repository;

import com.upr.botanicalGarden.model.Seed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedRepository extends JpaRepository<Seed, Long> {
}
