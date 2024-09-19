package Ejercicios19_06_24;
import java.util.*;

public class TablasParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("!INTRODUCE LA CANTIDAD DE NÚMEROS QUE QUIERES EN LA TABLA¡" + "\n");
		int longitud = entrada.nextInt();
		int tablaNumeros [] = new int [longitud];
		int tablaPares [] = new int [longitud];
		int tablaImpares [] = new int [longitud];

		for(int i = 0; i < tablaNumeros.length; i++) {
			System.out.println("\n" + "Introduce el digito: " + (i + 1) + "\n");
			tablaNumeros[i] = entrada.nextInt();
		}
		Arrays.sort(tablaNumeros);
		System.out.println("\n" + "Tabla ordenada de números: " + Arrays.toString(tablaNumeros));
		
		for(int k = 0; k < tablaNumeros.length; k++) {
			if(tablaNumeros[k] % 2 == 0) {
				tablaPares[k] = tablaNumeros[k];
			}
			else {
				tablaImpares[k] = tablaNumeros[k];
			}
		}
		System.out.println("\n" + "Tabla números pares: " + Arrays.toString(tablaPares));
		System.out.println("\n" + "Tabla números impares: " + Arrays.toString(tablaImpares));
		entrada.close();
	}
}
