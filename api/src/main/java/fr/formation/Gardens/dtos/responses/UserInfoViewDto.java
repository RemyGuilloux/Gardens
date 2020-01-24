package fr.formation.Gardens.dtos.responses;

public class UserInfoViewDto {
	String  username;

    Long id; 

    public String getUsername() { return username; }

    public Long getId() { return id; }

	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
