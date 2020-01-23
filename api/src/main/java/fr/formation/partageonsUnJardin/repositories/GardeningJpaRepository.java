package fr.formation.partageonsUnJardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.partageonsUnJardin.dtos.GardeningViewDto;
import fr.formation.partageonsUnJardin.entities.Gardening;

@Repository
public interface GardeningJpaRepository extends JpaRepository<Gardening, Long> {
GardeningViewDto getById(Long id);
}
