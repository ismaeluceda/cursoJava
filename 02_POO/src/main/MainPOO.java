package main;

import entidades.Direccion;
import entidades.Persona;

public class MainPOO {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Ismael";
		p1.edad = 44;
		p1.peso = 78;
		
		Persona p2 = new Persona();
		p2.nombre = "Rocio";
		p2.edad = 43;
		p2.peso = 55;
		
		p1.andar(10);
		//p1.metros = 45 - metros es private
		p1.getMetros();
		
		Persona p3 = p2; //con esto apuntamos al mismo objeto donde apunte p2
		p2.andar(12);
		System.out.println(p3.getMetros());
		
		cambiarEdad(p1);
		System.out.println(p1.edad); //imprime 66, se ha pasado una referencia
		
		int numero = 5;
		cambiarNumero (numero);
		System.out.println(numero); //imprime 5, se ha pasado un primitivo
		
		crearPersona(); //este metodo no hace nada
		Persona p5 = crearPersonaX();//este si 
		System.out.println(p5.nombre+p5.peso); //valores sin inicializar null y 0.0
		
		//uso de constructores
		Persona p6 = new Persona("Juan", 10, 45);
		
		int cp = 07050; //numeros que empiezan por 0 van en base octal, no deja numero mayores que 7
		System.out.println(cp);//lo imprime en decimal
		
		Persona p7 = new Persona("Laura", 20, 50);
		p7.direccion = new Direccion(); //no utilizar el new dentro de la clase persona para no crear dependencias fuertes entre objetos
		p7.direccion.tipoVia = "Calle";
		
	}
	public static void cambiarEdad (Persona p) {
		p.edad = 66;//esta variable muere al finalizar el metodo pero ha actualizado el objeto al que hace referencia, el cambio no se pierde
	}

	public static void cambiarNumero (int numero) {
		numero = 10; //esta variable muere al finalizar el metodo, no actualiza nada
	}
	
	public static void crearPersona() {
		Persona p = new Persona();
		p.edad = 33;
		//trabajamos con la persona...
		//al finalizar el metodo muere el objeto, no tiene mas referencias
	}
	
	public static Persona crearPersonaX() {
		Persona p = new Persona();
		p.edad = 34;
		return p;
	}
}
