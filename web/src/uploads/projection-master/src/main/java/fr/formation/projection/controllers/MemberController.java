package fr.formation.projection.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.projection.dtos.MemberCreateDto;
import fr.formation.projection.dtos.MemberIdDto;
import fr.formation.projection.services.MemberService;

/**
 * A {@code RestController} to handle {@code Member}.
 * <p>
 * {@code MemberService} bean is injected by Spring.
 * 
 * @author Thierry VILLEPREUX
 */
@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService service;

    /**
     * Creates a {@code MemberController} with given injected
     * {@code MemberService}.
     *
     * @param service an injected {@code MemberService}
     */
    protected MemberController(MemberService service) {
	this.service = service;
    }

    /**
     * Validate given {@code MemberCreateDto} if needed and send it to the
     * {@code MemberService}.
     * 
     * @param member the {@code MemberCreateDto} to be persisted.
     * @return the id of the persisted member represented by a
     *         {@linkplain MemberIdDto}.
     */
    @PostMapping
    public MemberIdDto save(@RequestBody MemberCreateDto member) {
	return service.save(member);
    }
}
