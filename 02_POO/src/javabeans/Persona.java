package javabeans;
/*
 * Notaciones javabeans es un convenio java sobre la creacion de objetos simples, POJOs (Plain Old Java Object)
 * son objetos sencillos q no tienen herencia ni logica complicada (herencia, interfaces...)
 * Para hacer una clase javabean -> atributos privados y metodos accesores y modificadores publicos /getters/setters.
 * Los atributos pasan a ser propiedades
 */

public class Persona {
	private String nombre;
	private int edad;
	private double peso;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/** CONSTRUCTOR
	 * @param nombre
	 * @param edad
	 * @param peso
	 */
	public Persona(String nombre, int edad, double peso) {
		super();
		setNombre(nombre);
		setEdad(edad);
		setPeso(peso);
	}

	/* Se sobreescribe el comportamiento por defecto del metodo toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	

}
