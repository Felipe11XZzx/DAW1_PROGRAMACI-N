package Evaluacion2;
import java.util.*;

public class Main_Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Crea una tabla de 1000 elementos llamada ‘t’. (0,25 ptos)
		 */	
		
		int t [] = new int [1000];
		
		/*
		 * 2. Inicialízala con números enteros aleatorios comprendidos entre -100 y 100
		 * (el primero no incluído, el segundo sí). (0,5 ptos)
		 */
		int sumaAleatorios = 0;
		
		for(int i = 0; i < t.length; i++) {
			int aleatorio = (int) (Math.random() * 201 ) - 100;
			System.out.print("\n" + aleatorio + " ");
			t[i] = aleatorio;
			sumaAleatorios += aleatorio;
		}
		
		/*
		 * 3. Muestra la suma de todos los elementos de la tabla por consola. (0,25
		 * ptos)
		 */	
		System.out.println("\n" + "\n" + "Suma de los números aleatorios: " + sumaAleatorios);
		
		/*
		 * 4. Borra todos los números 20 que haya en t. (1,25 ptos)
		 */	
		for(int i = 0; i < t.length; i++) {
			if(t[i] == 20) {
				t[i] = t[t.length - 1];
				t = Arrays.copyOf(t, t.length - 1);
				i--;
			}
		}
		
		/*5. Inserta el número 28 en dicha tabla. (0,5 ptos)*/
		t = Arrays.copyOf(t, t.length + 1);
		t[t.length - 1] = 28;
		
		/*6. Ordena la tabla de menor a mayor (ahora es una tabla ordenada, trátala de manera
		que siempre esté ordenada). (0,25 ptos)
		*/
		Arrays.sort(t);
		
		/*7. Inserta el número 35. (1 punto)*/
		int numero = 35;
		int posicionInsertar = Arrays.binarySearch(t, numero);
		if(posicionInsertar >= 0) {
			t = Arrays.copyOf(t, t.length + 1);
			System.arraycopy(t, posicionInsertar, t, posicionInsertar + 1, t.length - posicionInsertar - 1);
			t[posicionInsertar] = numero;
			System.out.println("Insertando el 35: " + Arrays.toString(t) + "\n");
		}
		
		/*8. Muestra cuántos registros tiene la tabla en estos momentos. (0,25 ptos)*/
		System.out.println("Número registros: " + t.length);
		
		/*9. Renombra la tabla, ahora llámala ‘tablaexamen’ (0,25 ptos)*/
		int tablaexamen [] = t;
		System.out.println("Tabla Examen: " + Arrays.toString(tablaexamen));
		
	}

}
