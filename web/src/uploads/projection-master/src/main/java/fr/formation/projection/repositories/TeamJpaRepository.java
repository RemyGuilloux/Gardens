package fr.formation.projection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.projection.entities.Team;

/**
 * A {@code JpaRespository} to handle {@code Member} persistence.
 * 
 * @author Thierry VILLEPREUX
 */
public interface TeamJpaRepository extends JpaRepository<Team, Long> {
    //
}
