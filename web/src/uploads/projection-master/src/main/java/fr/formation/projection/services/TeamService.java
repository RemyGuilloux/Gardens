package fr.formation.projection.services;

import fr.formation.projection.dtos.TeamCreateDto;
import fr.formation.projection.dtos.TeamIdDto;

/**
 * The interface exposing services to handle {@code Team}.
 * 
 * @author Thierry VILLEPREUX
 */
public interface TeamService {

    /**
     * Create a {@code Team}.
     * 
     * @param team the team data
     * @return the {@code TeamIdDto} containing the newly {@code Team}
     *         identifier
     */
    TeamIdDto save(TeamCreateDto team);
}
