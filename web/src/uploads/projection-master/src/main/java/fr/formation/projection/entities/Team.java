package fr.formation.projection.entities;

import java.util.List;

import javax.persistence.*;

/**
 * Represents a {@code Team}.
 * 
 * @author vilth
 */
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Member> members;

    @Override
    public String toString() {
	return "Team [id=" + id + ", name=" + name + ", members=" + members
		+ "]";
    }
}
