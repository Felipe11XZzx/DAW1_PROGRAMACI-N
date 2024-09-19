package EjerciciosLista;
import java.util.*;
import InterfacesLista.ICola;
import InterfacesLista.IPila;

public class Lista implements ICola, IPila {

	private Integer tabla[];
	
	public Lista() {
		this.tabla = new Integer[0];
	}
	
	public void insertarNumeroFinal(Integer numeroNuevo) {
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
		this.tabla[this.tabla.length - 1] = numeroNuevo;
	}
	
	public void insertarListaFinal(Lista otraLista) {
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, this.tabla, this.tabla.length - otraLista.tabla.length, otraLista.tabla.length);
	}
	
	public void insertarNumeroPosicion(int posicion, Integer numeroNuevo) {
		if(posicion < 0 || posicion > this.tabla.length) {
			System.out.println("Posición Para Insertar Invalida.");
		}
		else {
			Integer tAxuliar [] = new Integer [this.tabla.length + 1];
			System.arraycopy(this.tabla, 0, tAxuliar, 0, this.tabla.length);
			System.arraycopy(this.tabla, posicion, tAxuliar, posicion + 1, tAxuliar.length - posicion - 1);
			tAxuliar[posicion] = numeroNuevo;
			this.tabla = tAxuliar;
		}
	}
	
	public Integer eliminarElemento(int posicion) {
		Integer eliminado = this.tabla[posicion];
		Integer posicionEliminar = posicion;
		System.arraycopy(this.tabla, posicionEliminar + 1, tabla, posicionEliminar, this.tabla.length - posicionEliminar - 1);
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
		return eliminado;
	}
	
	public int buscarElemento(Integer claveBusqueda) {
		int posicionElemento = -1;
		for(int k = 0; k < this.tabla.length && posicionElemento == -1; k++) {
			if(this.tabla[k].equals(claveBusqueda)) {
				posicionElemento = k;
			}
		}
		return posicionElemento;
	}
	
	public Integer getValor(int posicion) {
		return this.tabla[posicion];
	}
	
	public int numeroElementosLista() {
		return this.tabla.length;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = true;
		Lista listaParametro = new Lista();
		listaParametro = (Lista)(obj);
		if(this.tabla.length != listaParametro.tabla.length) {
			iguales = false;
		}
		else {
			for(int i = 0; i < this.tabla.length; i++) {
				if(this.tabla[i] != listaParametro.tabla[i]) {
					iguales = false;
				}
			}
		}
		return iguales;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		for(int i = 0; i < this.tabla.length; i++) {
			cadena += this.tabla[i] + " ";
		}
		return "\n" + "Mostrando la Lista: " + cadena;
	}
	
	public void mostrarLista() {
		System.out.println("\n" + "Lista [tabla = " + Arrays.toString(tabla) + "]");
	}

	public static Lista concatena(Lista l1, Lista l2) {
		Lista l3 = new Lista();
		l3.tabla = Arrays.copyOf(l1.tabla, l1.tabla.length + l2.tabla.length);
		System.arraycopy(l2.tabla, 0, l3.tabla, l1.tabla.length, l2.tabla.length);
		System.out.println("\n" + "Lista Concatenada: " + Arrays.toString(l3.tabla));
		return l3;
	}

	@Override
	public void encolar(Integer numeroNuevo) {
		insertarNumeroFinal(numeroNuevo);
	}

	@Override
	public Integer desencolar() {
		return eliminarElemento(0);
	}

	@Override
	public void apilar(Integer numeroNuevo) {
		insertarNumeroFinal(numeroNuevo);
	}

	@Override
	public void desapilar() {
		eliminarElemento(0);
	}
}