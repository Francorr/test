package init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.BeanConfig;
import model.Persona;

public class Init {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class);
		context.refresh();
		
		
		
		Persona persona = (Persona) context.getBean("persona");
		System.out.println(persona.getNome() + " " + persona.getCognome());
	}

}
