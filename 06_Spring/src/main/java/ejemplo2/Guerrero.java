package ejemplo2;

public class Guerrero {
	private String nombre;
	private Arma arma;

	public Guerrero() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void atacar() {
		System.out.println("Soy el guerrero " + nombre + " y voy a atacar");
		arma.usar();
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
}
