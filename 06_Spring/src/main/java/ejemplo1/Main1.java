package ejemplo1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	private static ApplicationContext context = 
			new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		// Manera clasica, Spring no esta llevando el control del objeto
		Persona p = new Persona();
		p.setNombre("Pepe");
		p.setEdad(20);
		p.setPeso(100);
		
		//uso de beans configurados en xml
		//arrancamos nuestro contenedor de objetos de spring
		
		Persona pepito = context.getBean("pepito", Persona.class); //metodo sobrecargado, le indicamos el objeto y la clase a la que lo queremos castear
		System.out.println(pepito.getNombre());
		
		//Ojo, los Prototype, cuando Spring te devuelve la referencia al objeto, ya depende de ti el ciclo de vida
		Persona p1 = context.getBean("personaGenerica", Persona.class);
		p1.setNombre("Bart");
		//para no perder esta persona la metemos en un array que hemos declarado como singleton
		ArrayList<Persona> listaPersonas = context.getBean("arrayPersonas", ArrayList.class);
		listaPersonas.add(p1);
		System.out.println(listaPersonas);
		mostrarPersona(p1);
				
	}

	private static void imprimirPersona(Persona p) {
		imprimirPersona(p);
		
	}

	private static void mostrarPersona(Persona p) {
		System.out.println(p);
		Persona p2 = context.getBean("pepito",Persona.class);
				
	}

}
