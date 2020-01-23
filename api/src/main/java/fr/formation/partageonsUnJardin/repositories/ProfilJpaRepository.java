package fr.formation.partageonsUnJardin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.partageonsUnJardin.dtos.ProfilViewDto;
import fr.formation.partageonsUnJardin.entities.Profil;

@Repository
public interface ProfilJpaRepository extends JpaRepository<Profil, Long> {
	ProfilViewDto getById(Long id);

	List<ProfilViewDto> findAllProjectedBy();
}
