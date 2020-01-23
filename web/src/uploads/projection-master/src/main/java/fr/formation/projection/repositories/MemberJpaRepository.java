package fr.formation.projection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.projection.entities.Member;

/**
 * A {@code JpaRespository} to handle {@code Member} persistence.
 * 
 * @author Thierry VILLEPREUX
 */
public interface MemberJpaRepository extends JpaRepository<Member, Long> {
    //
}
