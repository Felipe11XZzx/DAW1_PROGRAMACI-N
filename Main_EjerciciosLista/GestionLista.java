package Main_EjerciciosLista;
import java.util.ArrayList;
import EjerciciosLista.Lista;

public class GestionLista {

	private ArrayList<Lista> gestionLista;
	
	public GestionLista() {
		this.gestionLista = new ArrayList<>();
	}
	
	public void agregarLista(Lista obj) {
		this.gestionLista.add(obj);
	}
	
	public void eliminarLista(int posicion) {
		this.gestionLista.remove(posicion);
	}
	
	@Override
	public String toString() {
			String cadena = "";
		for(Lista listas : gestionLista) {
			cadena += listas.toString();
		}
		return cadena;
	}
}