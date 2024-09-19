package Main_EjerciciosLista;
import EjerciciosLista.Lista;

public class Main_ArrayList_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l1 = new Lista();
		l1.insertarNumeroFinal(7);
		l1.insertarNumeroFinal(8);
		l1.insertarNumeroFinal(9);
		l1.insertarNumeroFinal(10);
		
		Lista l2 = new Lista();
		l2.insertarNumeroFinal(1);
		l2.insertarNumeroFinal(2);
		l2.insertarNumeroFinal(3);
		l2.insertarNumeroFinal(4);
		
		GestionLista listaGestionada1 = new GestionLista();
		listaGestionada1.agregarLista(l1);
		listaGestionada1.agregarLista(l2);	
		System.out.println("\n" + "Lista Número: " + (1) + listaGestionada1.toString());
		listaGestionada1.eliminarLista(0);
		System.out.println("\n" + "Lista Número: " + (1) + "\n" + "Despues de eliminar la Lista Número: " + (1) + listaGestionada1.toString());
	}
}