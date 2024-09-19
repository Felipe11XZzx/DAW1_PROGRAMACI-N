package EjerciciosLista;

public class Pila {
	
	private Lista pila1;
	
	public Pila() {
		pila1 = new Lista();
	}
	
	public void apilar(Integer numeroNuevo) {
		pila1.insertarNumeroFinal(numeroNuevo);
	}
	
	public void desapilar() {
		pila1.eliminarElemento(0);
	}
	
	public void mostrarPila() {
		pila1.mostrarLista();
	}
}