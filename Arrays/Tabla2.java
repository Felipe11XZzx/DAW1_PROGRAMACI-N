package Arrays;
import java.util.*;

public class Tabla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números que quieres introducir por teclado: " + "\n");
		int cantidad = entrada.nextInt();
		System.out.println();
		int numeros [] = new int [cantidad];
		int cantidadPositivos = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int cantidadNegativos = 0;
		int cerosIntroducidos = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número por teclado: " + "\n");
			numeros[i] = entrada.nextInt();
			System.out.println();
		}
		System.out.println();
		System.out.println("Tabla de los números introducidos por teclado: " + Arrays.toString(numeros));
		
		for(int k = 0; k < numeros.length; k++) {
			
			if(numeros[k] > 0) {
				cantidadPositivos++;
				sumaPositivos += numeros[k];
			}
			else if(numeros[k] < 0) {
				cantidadNegativos++;
				sumaNegativos += numeros[k];
			}
			else {
				cerosIntroducidos++;
			}
		}
		entrada.close();
		double mediaNegativos = (double) sumaNegativos / (double) cantidadNegativos;
		double mediaPositivos = (double) sumaPositivos / (double) cantidadPositivos;
		System.out.println("Media de los números negativos introducidos: " + mediaNegativos + "\n" + "Media de los números positivos introducidos: " + mediaPositivos + "\n" + "Cantidad de ceros introducidos: " + cerosIntroducidos);
	}

}
