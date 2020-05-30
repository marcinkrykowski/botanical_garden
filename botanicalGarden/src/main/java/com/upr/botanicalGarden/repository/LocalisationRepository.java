package com.upr.botanicalGarden.repository;

import com.upr.botanicalGarden.model.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalisationRepository extends JpaRepository<Localisation, Long> {
}
