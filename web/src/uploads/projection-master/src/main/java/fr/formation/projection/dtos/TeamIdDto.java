package fr.formation.projection.dtos;

/**
 * A DTO representing the identifier of a {@code Team}.
 * <p>
 * provide a convenient representation of the identifier, that can be used to
 * find or delete a {@code Team}.
 * 
 * @author Thierry VILLEPREUX
 */
public class TeamIdDto {

    private Long id;

    /**
     * Default no-arg empty constructor
     */
    protected TeamIdDto() {
	//
    }

    @Override
    public String toString() {
	return "{id=" + id + "}";
    }

    /**
     * Returns the id of given {@code TeamIdDto}.
     * 
     * @return an id
     */
    public Long getId() {
	return id;
    }
}
