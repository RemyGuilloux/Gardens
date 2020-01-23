package fr.formation.projection.dtos;

import java.util.List;

/**
 * A DTO representing common inputs and validation constraints in order to
 * create a {@code Team}.
 * 
 * @author Thierry VILLEPREUX
 */
public class TeamCreateDto {

    private String name;

    private List<MemberIdDto> members;

    /**
     * Default no-arg empty constructor
     */
    protected TeamCreateDto() {
	//
    }

    /**
     * Returns the name of given {@code TeamCreateDto}.
     * 
     * @return a {@code name}
     */
    protected String getName() {
	return name;
    }

    /**
     * Returns the {@code List} of {@code MemberIdDto} for given
     * {@code TeamCreateDto}.
     * 
     * @return a {@code List} of {@code MemberIdDto}.
     */
    protected List<MemberIdDto> getMembers() {
	return members;
    }

    /**
     * Set the given {@code name} to this {@code TeamCreateDto}
     * 
     * @param name the given {@code name}
     */
    protected void setName(String name) {
	this.name = name;
    }

    /**
     * Set the given {@code List} of {@code MemberIdDto} to this
     * {@code TeamCreateDto}
     * 
     * @param members the given {@code List} of {@code MemberIdDto}
     */
    protected void setMembers(List<MemberIdDto> members) {
	this.members = members;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", members=" + members + "}";
    }
}
