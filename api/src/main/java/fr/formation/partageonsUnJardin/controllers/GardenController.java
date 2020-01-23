package fr.formation.partageonsUnJardin.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.partageonsUnJardin.dtos.GardenViewDto;
import fr.formation.partageonsUnJardin.entities.Garden;
import fr.formation.partageonsUnJardin.services.GardenService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping()
public class GardenController {
	private final GardenService service;
	
	
	public GardenController(GardenService service) {
		this.service = service;
	    }
	
	@GetMapping("/gardens/{id}")
    public GardenViewDto getById(@PathVariable Long id) {
	 return service.getById(id);
	
    }
	@GetMapping("/gardens")
	public List<GardenViewDto> getAllGardens(){
		return service.getAllGardens();
	}
	
	@PostMapping("/gardens")
	public Garden createGarden(@Valid @RequestBody Garden garden) {
		return service.save(garden);
	}
	@DeleteMapping("gardens/{id}")
	public void deleteMatch(@PathVariable Long id) {
		service.deleteById(id);
	}
	@PutMapping ("/gardens/{id}")
	public Garden updateGarden(@Valid @RequestBody Garden garden) {
		return service.update(garden);
	}
}
