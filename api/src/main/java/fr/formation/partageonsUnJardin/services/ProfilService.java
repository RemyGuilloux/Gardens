package fr.formation.partageonsUnJardin.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import fr.formation.partageonsUnJardin.dtos.ProfilViewDto;
import fr.formation.partageonsUnJardin.entities.Profil;

public interface ProfilService {
	ProfilViewDto getById(Long id);
	List<ProfilViewDto> getAllProfils();
	Profil save(@Valid Profil profil);
	void deleteByid(Long id);
	Profil update(@Valid Profil profil);
	
	
	
}
