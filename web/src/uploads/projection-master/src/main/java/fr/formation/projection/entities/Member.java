package fr.formation.projection.entities;

import javax.persistence.*;

/**
 * Represents a {@code Member}.
 *
 * @author thierry VILLEPREUX
 */
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String email;

    @Override
    public String toString() {
	return "{id=" + id + ", firstname=" + firstname + ", lastname="
		+ lastname + ", email=" + email + "}";
    }
}
