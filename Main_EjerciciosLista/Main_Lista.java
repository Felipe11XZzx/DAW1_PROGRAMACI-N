package Main_EjerciciosLista;
import EjerciciosLista.Lista;
import InterfacesLista.ICola;
import java.util.*;

public class Main_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CREACIÓN DE LA LISTA Y VALORES, IMPRIMIENDO LISTA.
		Lista lista1 = new Lista();
		lista1.insertarNumeroFinal(99);
		lista1.insertarNumeroFinal(88);
		lista1.insertarNumeroFinal(77);
		lista1.insertarNumeroFinal(66);
		lista1.mostrarLista();

		Lista lista2 = new Lista();
		lista2.insertarNumeroFinal(55);
		lista2.insertarNumeroFinal(44);
		lista1.insertarListaFinal(lista2);
		lista1.mostrarLista();
		
		lista1.eliminarElemento(4);
		lista1.mostrarLista();
		
		lista1.insertarNumeroPosicion(0, 33);
		lista1.mostrarLista();
		
		lista1.eliminarElemento(0);
		lista1.mostrarLista();
		
		System.out.println("\n" + "En que posición esta en valor buscado? " + lista1.buscarElemento(55));
		System.out.println("\n" + "Valor de la posición buscada: " + lista1.getValor(4));
		
		lista1.mostrarLista();
		lista2.mostrarLista();
		Lista.concatena(lista1, lista2);
		
		Lista lista3 = new Lista();
		lista3.insertarNumeroFinal(99);
		lista3.insertarNumeroFinal(88);
		lista3.insertarNumeroFinal(77);
		lista3.insertarNumeroFinal(66);
		lista3.insertarNumeroFinal(44);
		System.out.println("\n" + "Las Listas Son Iguales? " + lista3.equals(lista1) + "\n");
		
		ICola cola = new ICola() {
			Lista listaAnonima = new Lista();

			@Override
			public void encolar(Integer numeroNuevo) {
				listaAnonima.insertarNumeroFinal(numeroNuevo);
			}

			@Override
			public Integer desencolar() {
				return listaAnonima.eliminarElemento(0);
			}
		};
		
		System.out.println("!BIENVENIDO AL PROGRAMA DE LA CLASE ANÓNIMA¡ " + "\n" + "(INTRODUCE UN NÚMERO NEGATIVO PARA DEJAR DE ENCOLAR NÚMEROS -1)" + "\n");
		Scanner entrada = new Scanner(System.in);
		Integer numero = entrada.nextInt();
		
		while(numero != -1) {
			cola.encolar(numero);
			numero = entrada.nextInt();
		}
		entrada.close();
		System.out.println();
		
		while(numero != null) {
			numero = cola.desencolar();
			System.out.print(numero + " ");
		}
	}
}
