package fr.formation.Gardens.exceptions;

public class ResourceNotFound extends RuntimeException {

	private static final long serialVersionUID = -4482740931344541173L;

	public ResourceNotFound() {
		super();

	}

	public ResourceNotFound(String message) {
		super(message);
	}

}
