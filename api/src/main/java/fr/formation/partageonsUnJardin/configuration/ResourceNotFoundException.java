package fr.formation.partageonsUnJardin.configuration;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException() {
		
	    }

	    public ResourceNotFoundException(String message) {
		super(message);
	    }

}
