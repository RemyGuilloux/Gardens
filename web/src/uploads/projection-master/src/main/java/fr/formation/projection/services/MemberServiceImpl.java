package fr.formation.projection.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.projection.dtos.MemberCreateDto;
import fr.formation.projection.dtos.MemberIdDto;
import fr.formation.projection.entities.Member;
import fr.formation.projection.repositories.MemberJpaRepository;

/**
 * The default concrete implementation of {@code MemberService}.
 * <p>
 * {@code MemberJpaRepository} is injected by Spring.
 * 
 * @author Thierry VILLEPREUX
 */
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberJpaRepository repository;

    private final ModelMapper mapper;

    /**
     * Creates a {@code MemberServiceImpl} with given injected
     * {@code ModelMapper} and {@code MemberJpaRepository}.
     * 
     * @param repository the injected {@code MemberJpaRepository}
     * @param mapper the injected {@code ModelMapper}
     */
    protected MemberServiceImpl(MemberJpaRepository repository,
	    ModelMapper mapper) {
	this.repository = repository;
	this.mapper = mapper;
    }

    @Override
    public MemberIdDto save(MemberCreateDto inputs) {
	Member entity = mapper.map(inputs, Member.class);
	entity = repository.save(entity);
	return mapper.map(entity, MemberIdDto.class);
    }
}
