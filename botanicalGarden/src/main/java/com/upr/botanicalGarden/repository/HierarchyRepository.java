package com.upr.botanicalGarden.repository;

import com.upr.botanicalGarden.model.Hierarchy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HierarchyRepository extends JpaRepository<Hierarchy, Long> {
}
