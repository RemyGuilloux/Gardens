package fr.formation.partageonsUnJardin.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="gardening")
public class Gardening  {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column (name="type", nullable = false)
	private String type;
	@Column(name="localisation", nullable=false)
	private String localisation;
	@Column(name="name", nullable=false)
	private String name;
	@Column(name="lastname", nullable=false)
	private String lastname;
	@Column(name="phone", nullable=false)
	private String phone;
	@Column(name="mail", nullable = false)
	private String mail;
	@Column(name="gender", nullable=false)
	private String gender;
	

	public Gardening() {
		
	}
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil_gardening",
	joinColumns =
	@JoinColumn(name = "profil_id"),
	inverseJoinColumns =
	@JoinColumn (name ="gardening_id"))
	private Set<Profil> profils;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Set<Profil> getProfils() {
		return profils;
	}
	public void setProfils(Set<Profil> profils) {
		this.profils = profils;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((profils == null) ? 0 : profils.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Gardening other = (Gardening) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (profils == null) {
			if (other.profils != null)
				return false;
		} else if (!profils.equals(other.profils))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Gardening [id=" + id + ", type=" + type + ", localisation=" + localisation + ", name=" + name
				+ ", lastname=" + lastname + ", phone=" + phone + ", mail=" + mail + ", gender=" + gender + ", profils="
				+ profils + "]";
	}

	
	
	

}
