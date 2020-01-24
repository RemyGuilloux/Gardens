package fr.formation.Gardens.services;


import java.util.List;

import javax.validation.Valid;

import fr.formation.Gardens.dtos.GardenViewDto;
import fr.formation.Gardens.entities.Garden;

public interface GardenService {
	

	GardenViewDto getById(Long id);

	Garden save(@Valid Garden garden);

	List<GardenViewDto> getAllGardens();
	

	void deleteById(Long id);


	Garden update(Long id, @Valid Garden garden);

}
