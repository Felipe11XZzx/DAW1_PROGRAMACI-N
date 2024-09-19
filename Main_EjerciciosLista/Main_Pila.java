package Main_EjerciciosLista;
import EjerciciosLista.Pila;

public class Main_Pila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREANDO LA PILA E INSERTANDO VALORES.
		
		Pila pila1 = new Pila();
		pila1.apilar(11);
		pila1.apilar(21);
		pila1.apilar(31);
		pila1.apilar(41);		
		pila1.mostrarPila();	
		
		// DESAPILANDO LA PILA.
		pila1.desapilar();
		pila1.mostrarPila();
		
		pila1.desapilar();
		pila1.mostrarPila();
		
		pila1.desapilar();
		pila1.mostrarPila();
	}
}