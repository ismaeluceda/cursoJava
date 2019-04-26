package main;

import java.util.ArrayList;

import entidades.Director;
import entidades.Empleado;
import entidades.Jefe;
import entidades.Programador;

public class MainHerencia {

	public static void main(String[] args) {
		Empleado emp1 = new Programador();
		emp1.setDni("12345678A");
		emp1.setNombre("Paco");
		emp1.setNomina(1000);
		
		Jefe jefe1 = new Jefe();
		jefe1.setDni("87654321Z");
		jefe1.setNombre("Curro");
		jefe1.setNomina(1600);
		jefe1.setIncentivos(300);
		
		Director dir1 = new Director();
		dir1.setDni("54545454G");
		dir1.setNombre("Harry");
		dir1.setNomina(2300);
		ArrayList<Empleado> listaEmps = new ArrayList<>();
		listaEmps.add(emp1);
		listaEmps.add(jefe1);
		dir1.setListaEmpleados(listaEmps);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(emp1);
		empresa.add(jefe1);
		empresa.add(dir1);	
		
		calcularSueldo(empresa);
		
		Empleado empl1 = empresa.get(1);
		System.out.println(empl1.getDni()); //el 1 es jefe pero no puedo utilizar la propiedad incentivos
		if(empresa.get(1) instanceof Jefe) {
			/*
			 * instanceof nos devuelve true en caso de que la referencia este apuntando a un objeto de ese tipo
			 */
			Jefe jefe2 = (Jefe)empresa.get(1); //casteo a tipo Jefe
			System.out.println(jefe2.getIncentivos());
		}
		
	}
	
	public static void calcularSueldo(ArrayList<Empleado> empresa) {
		//calcular el sueldo de todos los empleados
		for(Empleado e : empresa) {
			System.out.println(e);
			System.out.println(e.getNombre() + "-" + e.getClass().getSimpleName() + " - " + e.calcularSueldo());
		}
	}

}
