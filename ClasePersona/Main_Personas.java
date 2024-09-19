package ClasePersona;
import PersonaPrueba.Prueba;

public class Main_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("AX726642", "Luis Felipe Hernandez Ortiz", 21);
		Persona p2 = new Persona("YN15184Z", "Ana Cristina Ruiz Izquierdo", 34);
		
		Prueba listaPersonas = new Prueba(1.73, "Española");
		listaPersonas.agregarPersona(p1);
		listaPersonas.agregarPersona(p2);
		System.out.println(listaPersonas.mostrarPersona());
	}
}