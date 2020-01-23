package fr.formation.projection.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.projection.dtos.TeamCreateDto;
import fr.formation.projection.dtos.TeamIdDto;
import fr.formation.projection.services.TeamService;

/**
 * A {@code RestController} to handle {@code Team}.
 * <p>
 * {@code TeamService} bean is injected by Spring.
 * 
 * @author Thierry VILLEPREUX
 */
@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService service;

    /**
     * Creates a {@code TeamController} with given injected {@code TeamService}.
     *
     * @param service an injected {@code TeamService}
     */
    protected TeamController(TeamService service) {
	this.service = service;
    }

    /**
     * Validate given {@code TeamCreateDto} if needed and send it to the
     * {@code TeamService}.
     * 
     * @param team the {@code TeamCreateDto} to be persisted.
     * @return the id of the persisted team represented by a
     *         {@linkplain TeamIdDto}.
     */
    @PostMapping
    public TeamIdDto save(@RequestBody TeamCreateDto team) {
	return service.save(team);
    }
}
