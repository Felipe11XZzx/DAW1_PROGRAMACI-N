package MercadilloArrays;
import java.util.Arrays;

public class FunciónSuma {
	
	public static int [] suma(int tabla[], int numElementos) {
		
		int longitud = tabla.length - numElementos + 1;
		int tablaCopia [] = new int [longitud];
		int suma;
		
		for(int i = 0; i < longitud; i++) {
				suma = 0;
			for(int k = 0; k < numElementos; k++) {
				suma += tabla[i + k];
			}
			tablaCopia[i] = suma;
		}

		System.out.println("Función suma arrays: " + Arrays.toString(tablaCopia));
		return tablaCopia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {10, 1, 5, 8, 9, 2};
		suma(tabla, 3);
	}
}