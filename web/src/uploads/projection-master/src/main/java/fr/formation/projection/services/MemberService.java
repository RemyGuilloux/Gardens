package fr.formation.projection.services;

import fr.formation.projection.dtos.MemberCreateDto;
import fr.formation.projection.dtos.MemberIdDto;

/**
 * The interface exposing services to handle {@code Member}.
 * 
 * @author Thierry VILLEPREUX
 */
public interface MemberService {

    /**
     * Create a {@code Member}.
     * 
     * @param member the member data
     * @return the {@code MemberIdDto} containing the newly {@code Member}
     *         identifier
     */
    MemberIdDto save(MemberCreateDto member);
}
