package fr.formation.projection.dtos;

/**
 * A DTO representing the identifier of a {@code Member}.
 * <p>
 * provide a convenient representation of the identifier, that can be used to
 * find or delete a {@code Member}.
 * 
 * @author Thierry VILLEPREUX
 */
public class MemberIdDto {

    private Long id;

    /**
     * Default no-arg empty constructor
     */
    protected MemberIdDto() {
	//
    }

    @Override
    public String toString() {
	return "{id=" + id + "}";
    }

    /**
     * Returns the id of given {@code MemberIdDto}.
     * 
     * @return an id
     */
    public Long getId() {
	return id;
    }
}
