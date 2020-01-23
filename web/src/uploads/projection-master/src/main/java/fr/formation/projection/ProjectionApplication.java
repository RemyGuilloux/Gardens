package fr.formation.projection;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The application class providing the Spring boot main method (bootstrapping
 * and launching), and configuration elements such as managed beans.
 */
@SpringBootApplication
public class ProjectionApplication {

    /**
     * The main method running the application.
     *
     * @param args the optional arguments
     * @see SpringApplication#run(Class, String...)
     */
    public static void main(String[] args) {
	SpringApplication.run(ProjectionApplication.class, args);
    }

    /**
     * Default {@code ModelMapper} bean.
     * <p>
     * Configuration provides field matching.
     *
     * @return an instance of {@code ModelMapper}
     */
    @Bean
    protected ModelMapper mapper() {
	ModelMapper mapper = new ModelMapper();
	mapper.getConfiguration().setFieldMatchingEnabled(true)
		.setFieldAccessLevel(AccessLevel.PRIVATE);
	return mapper;
    }
}
