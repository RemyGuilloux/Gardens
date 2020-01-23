package fr.formation.projection.dtos;

/**
 * A DTO representing common inputs and validation constraints in order to
 * create a {@code Member}.
 * 
 * @author Thierry VILLEPREUX
 */
public class MemberCreateDto {

    private String firstname;

    private String lastname;

    private String email;

    /**
     * Default no-arg empty constructor
     */
    protected MemberCreateDto() {
	//
    }

    @Override
    public String toString() {
	return "{firstname=" + firstname + ", lastname=" + lastname + ", email="
		+ email + "}";
    }

    /**
     * Returns the first name of given {@code MemberCreateDto}.
     * 
     * @return a {@code firstname}
     */
    protected String getFirstname() {
	return firstname;
    }

    /**
     * Returns the last name of given {@code MemberCreateDto}.
     *
     * @return a {@code lastname}
     */
    protected String getLastname() {
	return lastname;
    }

    /**
     * Returns the email of given {@code MemberCreateDto}.
     *
     * @return an {@code email}
     */
    protected String getEmail() {
	return email;
    }

    /**
     * Set the given {@code firstname} to this {@code MemberCreateDto}.
     *
     * @param firstname a {@code firstname}
     */
    protected void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    /**
     * Set the given {@code lastname} to this {@code MemberCreateDto}.
     *
     * @param lastname a {@code lastname}
     */
    protected void setLastname(String lastname) {
	this.lastname = lastname;
    }

    /**
     * Set the given {@code email} to this {@code MemberCreateDto}.
     *
     * @param email an {@code email}
     */
    protected void setEmail(String email) {
	this.email = email;
    }
}
