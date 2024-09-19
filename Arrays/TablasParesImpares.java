package Arrays;
import java.util.*;

public class TablasParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce la cantidad de números que quieres almacenar en la tabla: " + "\n");
		Scanner entrada = new Scanner(System.in);
		int longitud = entrada.nextInt();
		int listaNumeros [] = new int [longitud];
		int numerosPares [] = new int [0];
		int numerosImpares [] = new int [0];
		
		System.out.println();
		for(int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce los números que quieren guardar en la tabla uno por uno: " + i + 1 + "\n");
			listaNumeros[i] = entrada.nextInt();
			System.out.println();
		}
		entrada.close();
		System.out.println("Tabla con todos los números introducidos: " + Arrays.toString(listaNumeros) + "\n");
		
		for(int k = 0; k < listaNumeros.length; k++) {
			if(listaNumeros[k] % 2 == 0) {
				numerosPares = Arrays.copyOf(numerosPares, numerosPares.length + 1);
				numerosPares[numerosPares.length -1] = listaNumeros[k];
			}
			else {
				numerosImpares = Arrays.copyOf(numerosImpares, numerosImpares.length + 1);
				numerosImpares[numerosImpares.length - 1] = listaNumeros[k];
			}
		}
		Arrays.sort(numerosPares);
		Arrays.sort(numerosImpares);
		System.out.println("Tabla con los números pares ordenados: " + Arrays.toString(numerosPares) + "\n" + "Cantidad de números pares: " + numerosPares.length + "\n");
		System.out.println("Tabla con los números impares ordenados: " + Arrays.toString(numerosImpares) + "\n" + "Cantidad de números impares: " + numerosImpares.length);
	}
}
