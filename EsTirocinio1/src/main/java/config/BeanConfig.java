package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import model.Persona;

@Configuration
public class BeanConfig {

	@Bean	
    public Persona persona() {
        return new Persona();
	
}
}

