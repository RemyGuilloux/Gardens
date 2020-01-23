package fr.formation.partageonsUnJardin.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.partageonsUnJardin.dtos.GardeningViewDto;
import fr.formation.partageonsUnJardin.entities.Gardening;

public interface GardeningService {
	
	GardeningViewDto getById(Long id);

	List<Gardening> getAllGardenings();

	Gardening save(@Valid Gardening gardening);

	void deleteByid(Long id);

}

