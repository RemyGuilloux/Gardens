package fr.formation.partageonsUnJardin.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.partageonsUnJardin.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByCode(String string);
}
