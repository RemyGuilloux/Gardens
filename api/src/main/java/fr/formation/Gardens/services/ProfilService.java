package fr.formation.Gardens.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import fr.formation.Gardens.dtos.ProfilViewDto;
import fr.formation.Gardens.entities.Profil;

public interface ProfilService {
	ProfilViewDto getById(Long id);
	List<ProfilViewDto> getAllProfils();
	Profil save(@Valid Profil profil);
	void deleteByid(Long id);
	Profil update(@Valid Profil profil);
	
	
	
}
