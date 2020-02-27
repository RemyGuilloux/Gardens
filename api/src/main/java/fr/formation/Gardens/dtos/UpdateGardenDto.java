package fr.formation.Gardens.dtos;

public class UpdateGardenDto {
	private String name;
	private double size;
	private String localisation;
	private String typeOfGarden;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getTypeOfGarden() {
		return typeOfGarden;
	}

	public void setTypeOfGarden(String typeOfGarden) {
		this.typeOfGarden = typeOfGarden;
	}
}
