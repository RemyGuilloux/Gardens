package fr.formation.partageonsUnJardin.services;


import java.util.List;

import javax.validation.Valid;

import fr.formation.partageonsUnJardin.dtos.GardenViewDto;

import fr.formation.partageonsUnJardin.entities.Garden;

public interface GardenService {
	

	GardenViewDto getById(Long id);

	Garden save(@Valid Garden garden);

	List<GardenViewDto> getAllGardens();
	

	void deleteById(Long id);

	Garden update(@Valid Garden garden);

}
