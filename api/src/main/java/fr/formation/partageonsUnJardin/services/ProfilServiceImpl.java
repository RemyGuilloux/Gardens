package fr.formation.partageonsUnJardin.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.partageonsUnJardin.dtos.ProfilViewDto;
import fr.formation.partageonsUnJardin.entities.Profil;
import fr.formation.partageonsUnJardin.repositories.ProfilJpaRepository;


@Service
public class ProfilServiceImpl implements ProfilService {
	private final ProfilJpaRepository repository;

    private final ModelMapper mapper;
    
    protected ProfilServiceImpl(ProfilJpaRepository repository,
    	    ModelMapper mapper) {
    	this.repository = repository;
    	this.mapper = mapper;
        }

	@Override
	public ProfilViewDto getById(Long id) {
		
		 return repository.getById(id);
	}
	
	
	public List<ProfilViewDto> getAllProfils() {
		return repository.findAllProjectedBy();
	}

	

	@Override
	public Profil save(@Valid Profil profil) {
		
		return repository.save(profil);
	}

	@Override
	public void deleteByid(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Profil update(@Valid Profil profil) {
		
		Profil profileUp = new Profil();
		
		profileUp.setMail(profil.getMail());
		profileUp.setLastname(profil.getLastname());
		profileUp.setName(profil.getName());
		profileUp.setGender(profil.getGender());
		profileUp.setPhone(profil.getPhone());
		return profileUp;
	}

	

	
		
	

}
