package fr.formation.partageonsUnJardin.dtos;



public interface GardenViewDto {
	Long getId();
	String getName();
	double getSize();
	String getLocalisation();
	String getTypeOfGarden();
	AddressViewDto getAddress();
	ProfilViewDto getProfil();
	
	

}
