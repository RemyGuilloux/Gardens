package fr.formation.partageonsUnJardin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.partageonsUnJardin.dtos.AddressViewDto;
import fr.formation.partageonsUnJardin.entities.Address;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {
	AddressViewDto getById(Long id);

}
