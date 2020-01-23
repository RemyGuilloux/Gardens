package fr.formation.projection.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.projection.dtos.TeamCreateDto;
import fr.formation.projection.dtos.TeamIdDto;
import fr.formation.projection.entities.Team;
import fr.formation.projection.repositories.TeamJpaRepository;

/**
 * The default concrete implementation of {@code TeamService}.
 * <p>
 * {@code TeamJpaRepository} is injected by Spring.
 * 
 * @author Thierry VILLEPREUX
 */
@Service
public class TeamServiceImpl implements TeamService {

    private final TeamJpaRepository repository;

    private final ModelMapper mapper;

    /**
     * Creates a {@code TeamServiceImpl} with given injected {@code ModelMapper}
     * and {@code TeamJpaRepository}.
     * 
     * @param repository the injected {@code TeamJpaRepository}
     * @param mapper the injected {@code ModelMapper}
     */
    protected TeamServiceImpl(TeamJpaRepository repository,
	    ModelMapper mapper) {
	this.repository = repository;
	this.mapper = mapper;
    }

    @Override
    public TeamIdDto save(TeamCreateDto team) {
	Team entity = mapper.map(team, Team.class);
	entity = repository.save(entity);
	return mapper.map(entity, TeamIdDto.class);
    }
}
