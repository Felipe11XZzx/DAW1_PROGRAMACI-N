package MercadilloArrays;
import java.util.Arrays;

public class FunciónDesordenar {
	

	/*
	 * 2.- Escribe la función void desordenar (int t[]), que cambia de forma
	 * aleatoria los elementos contenidos en la tabla t, si la tabla estuviera
	 * ordenada dejaría de estarlo.
	 */
	
	public static void desordenar(int tabla[]) {
		
		for(int i = 0; i < tabla.length; i++) {
			int rango = (int) (Math.random() * 101);
			tabla[i] = rango;
		}
		System.out.println("Tabla con los números aleatorios: " + "\n" + Arrays.toString(tabla));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		desordenar(tabla);
	}

}
