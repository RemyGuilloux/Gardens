package fr.formation.partageonsUnJardin.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import fr.formation.partageonsUnJardin.dtos.GardenViewDto;
import fr.formation.partageonsUnJardin.dtos.ProfilViewDto;
import fr.formation.partageonsUnJardin.entities.Garden;
import fr.formation.partageonsUnJardin.repositories.GardenJpaRepository;
import fr.formation.partageonsUnJardin.repositories.ProfilJpaRepository;

@Service
public class GardenServiceImpl implements GardenService {
	
	private final GardenJpaRepository repository;
	

    private final ModelMapper mapper;
    
    protected GardenServiceImpl(GardenJpaRepository repository,
    	    ModelMapper mapper) {
    	this.repository = repository;
    	this.mapper = mapper;
    	
        }

	@Override
	public GardenViewDto getById(Long id) {
		
		 return repository.getById(id);
	}

	@Override
	public Garden save(@Valid Garden garden) {
		
		return repository.save(garden);
	}

	@Override
	public List<GardenViewDto> getAllGardens() {
		
		return repository.findAllProjectedBy();
	}
	

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public  Garden update(@Valid @RequestBody Garden garden) {
		
				
		Garden gardenUp = new Garden();
		
		gardenUp.setName(garden.getName());
		gardenUp.setSize(garden.getSize());
		garden.setTypeOfGarden(garden.getTypeOfGarden());
		
		return gardenUp;
	}

}
