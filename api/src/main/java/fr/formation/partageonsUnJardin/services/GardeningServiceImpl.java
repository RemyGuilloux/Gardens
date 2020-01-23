package fr.formation.partageonsUnJardin.services;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.partageonsUnJardin.dtos.GardenViewDto;
import fr.formation.partageonsUnJardin.dtos.GardeningViewDto;
import fr.formation.partageonsUnJardin.entities.Gardening;
import fr.formation.partageonsUnJardin.repositories.GardeningJpaRepository;
@Service
public class GardeningServiceImpl implements GardeningService {
	
	private final GardeningJpaRepository repository;
	
	
	private final ModelMapper mapper;
	
	
	protected GardeningServiceImpl (GardeningJpaRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public GardeningViewDto getById(Long id) {
		
		 return repository.getById(id);
	}

	@Override
	public List<Gardening> getAllGardenings() {
		
		return repository.findAll();
	}

	@Override
	public Gardening save(@Valid Gardening gardening) {
		
		return repository.save(gardening);
	}

	@Override
	public void deleteByid(Long id) {
		repository.deleteById(id);
		
	}
}
