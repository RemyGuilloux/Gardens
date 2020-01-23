package fr.formation.partageonsUnJardin.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="garden")
public class Garden  {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="size", nullable = false)
	private double size;
	@Column(name="localisation", nullable = false)
	private String localisation;
	@Column(name="type_of_garden", nullable = false)
	private String typeOfGarden;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Address address ;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Profil profil;
	
	
	
	public Garden() {
		
	}

	public Garden(Long id, String name, double size, String localisation, String typeOfGarden, Address address, Profil profil) {
		
		this.id = id;
		this.name = name;
		this.size = size;
		this.localisation = localisation;
		this.typeOfGarden = typeOfGarden;
		this.address = address;
		this.profil = profil;
		
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeOfGarden == null) ? 0 : typeOfGarden.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garden other = (Garden) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		if (typeOfGarden == null) {
			if (other.typeOfGarden != null)
				return false;
		} else if (!typeOfGarden.equals(other.typeOfGarden))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Garden [id=" + id + ", name=" + name + ", size=" + size + ", localisation=" + localisation
				+ ", typeOfGarden=" + typeOfGarden + ", address=" + address + "]";
	}
	
	
	
	
	
}
