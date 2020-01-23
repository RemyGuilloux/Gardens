package fr.formation.partageonsUnJardin.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.partageonsUnJardin.dtos.AddressViewDto;
import fr.formation.partageonsUnJardin.entities.Address;

public interface AddressService {

	AddressViewDto getById(Long id);

	List<Address> getALLAddresses();

	Address save(@Valid Address address);

	void deleteById(Long id);

	Address update(@Valid Address address);

}
