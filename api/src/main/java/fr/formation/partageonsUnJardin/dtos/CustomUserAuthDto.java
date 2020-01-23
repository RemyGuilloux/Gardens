package fr.formation.partageonsUnJardin.dtos;

import java.util.Set;

import fr.formation.partageonsUnJardin.entities.Role;

public interface CustomUserAuthDto {
	Long getId();

    String getUsername();

    String getPassword();

    Set<Role> getRoles();

    boolean isEnabled();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();

}
