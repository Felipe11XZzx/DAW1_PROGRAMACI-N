package ClaseArchivador;
import java.util.*;

public class Archivador {

	private int tabla [];
	
	public Archivador() {
		this.tabla = new int [0];
	}
	
	public void agregarNumeroExpediente(int Pnumero) {
		this.tabla = Arrays.copyOf(tabla, tabla.length + 1);
		this.tabla[this.tabla.length - 1] = Pnumero;
	}
	
	public void agregarExpedienteOrdenado(int Pnumero, int posicion) {
		int tablaAuxiliar [] = new int [this.tabla.length + 1];
		System.arraycopy(this.tabla, 0, tablaAuxiliar, 0, tabla.length);
		System.arraycopy(this.tabla, posicion, tablaAuxiliar, posicion + 1, tabla.length - posicion);
		tablaAuxiliar[posicion] = Pnumero;
		this.tabla = tablaAuxiliar;
	}
	
	public void eliminarNumeroExpediente(int numeroExpediente) {
		this.tabla[numeroExpediente] = this.tabla[this.tabla.length - 1];
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
	}
	
	public void eliminarNumeroExpedienteOrdenado(int numeroExpediente) {
		System.arraycopy(this.tabla, numeroExpediente + 1, this.tabla, numeroExpediente, tabla.length - numeroExpediente - 1);
		this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
	}

	public String mostrarArchivador() {
		return "Archivador [Números Expedientes = " + Arrays.toString(tabla) + "]";
	}
}