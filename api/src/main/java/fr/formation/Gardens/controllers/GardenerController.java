package fr.formation.Gardens.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.Gardens.dtos.GardeningViewDto;
import fr.formation.Gardens.entities.Gardening;
import fr.formation.Gardens.services.GardeningService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping()
public class GardeningController {

	private final GardeningService service;
	
	
	public GardeningController(GardeningService service ) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
	public GardeningViewDto getById(@PathVariable Long id) {
	return service.getById(id);
}
	@GetMapping ("/gardenings")
	public List<Gardening> getAllGardenings(){
		return service.getAllGardenings();
	}
	@PostMapping("/gardenings")
	public Gardening createGardening(@Valid @RequestBody Gardening gardening) {
		return service.save(gardening);
	}
	@DeleteMapping("/{id}")
	public void deleteMatch(@PathVariable Long id) {
		service.deleteByid(id);
	}
}