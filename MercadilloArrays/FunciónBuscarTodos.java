package MercadilloArrays;
import java.util.Arrays;

public class FunciónBuscarTodos {
	
	/*
	 * 1. Realiza la función: int[] buscarTodos (int t[], int clave), que crea y
	 * devuelve una tabla con todos los índices de los elementos donde se encuentra
	 * la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t,
	 * la función devolverá una tabla vacía.
	 */
	
	public static int [] buscarTodos(int tabla[], int clave) {
		
		int tablaCopia [] = new int [0];
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == clave) {
				tablaCopia = Arrays.copyOf(tablaCopia, tablaCopia.length + 1);
				tablaCopia[tablaCopia.length - 1] = i;
			}
		}
		System.out.println("Tabla con los indices donde se encuentran los valores: " + "\n" + Arrays.toString(tablaCopia));
		return tabla;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {11, 12, 12, 12, 11, 11};
		buscarTodos(tabla, 11);
	}
}