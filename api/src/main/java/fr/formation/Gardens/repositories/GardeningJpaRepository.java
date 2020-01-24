package fr.formation.Gardens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.Gardens.dtos.GardeningViewDto;
import fr.formation.Gardens.entities.Gardening;

@Repository
public interface GardeningJpaRepository extends JpaRepository<Gardening, Long> {
GardeningViewDto getById(Long id);
}
