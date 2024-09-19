package PersonaPrueba;
import java.util.*;
import ClasePersona.Persona;

public class Prueba {

	private double estaturaPersona;
	private ArrayList<Persona> listaPersonas;
	private String nacionalidadPersona;
	
	public Prueba(double medidaEstatura, String Pnacionalidad) {
		this.nacionalidadPersona = Pnacionalidad;
		this.estaturaPersona = medidaEstatura;
		this.listaPersonas = new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona) {
		this.listaPersonas.add(persona);
	}
	
	public void eliminarPersona(int posicion) {
		this.listaPersonas.remove(posicion);
	}
	
	public void setNacionalidad(String nuevaNacionalidad) {
		this.nacionalidadPersona = nuevaNacionalidad;
	}
	
	public String mostrarPersona() {
		String cadena = "";
		for(Persona personas : listaPersonas) {
			cadena += personas.mostrarPersona() +
				"Estatura: " + this.estaturaPersona + "\n" +
				"Nacionalidad: " + this.nacionalidadPersona + "\n";
		}
		return cadena;
	}
}