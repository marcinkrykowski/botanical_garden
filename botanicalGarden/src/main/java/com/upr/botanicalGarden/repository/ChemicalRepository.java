package com.upr.botanicalGarden.repository;

import com.upr.botanicalGarden.model.Chemical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChemicalRepository extends JpaRepository<Chemical, Long> {
}
