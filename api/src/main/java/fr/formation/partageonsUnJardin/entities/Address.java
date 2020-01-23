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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="address")
public class Address  {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name", nullable = false)
	private String name;
	@Column(name="num", nullable = false)
	private int num;
	@Column(name="town", nullable = false)
	private String town;
	@Column(name="zipcode", nullable = false)
	private int zipcode;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name="garden_address",
			joinColumns = @JoinColumn (name="address_id"),
	        inverseJoinColumns = @JoinColumn (name="garden_id")
	    )
	private Garden garden;
	public Address() {
		
	}


	public Address(Long id, String name, int num, String town, int zipcode, Garden garden) {
		
		this.id = id;
		this.name = name;
		this.num = num;
		this.town = town;
		this.zipcode = zipcode;
		this.garden = garden;
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


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	


	public Garden getGarden() {
		return garden;
	}


	public void setGarden(Garden garden) {
		this.garden = garden;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((garden == null) ? 0 : garden.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		result = prime * result + zipcode;
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
		Address other = (Address) obj;
		if (garden == null) {
			if (other.garden != null)
				return false;
		} else if (!garden.equals(other.garden))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", num=" + num + ", town=" + town + ", zipcode=" + zipcode
				+ ", garden=" + garden + "]";
	}


	

}
