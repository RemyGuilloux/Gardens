package fr.formation.Gardens.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.Gardens.dtos.GardeningViewDto;
import fr.formation.Gardens.entities.Gardening;

public interface GardeningService {
	
	GardeningViewDto getById(Long id);

	List<Gardening> getAllGardenings();

	Gardening save(@Valid Gardening gardening);

	void deleteByid(Long id);

}

