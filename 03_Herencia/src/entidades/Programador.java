package entidades;

public class Programador extends Empleado {

	public Programador() {
		// constructor por defecto
	}

	@Override
	public double calcularSueldo() {
		// El sueldo en este caso coincide con la nomina
		return getNomina();
	}

}
