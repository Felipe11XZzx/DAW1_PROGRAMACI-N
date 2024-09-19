package Bucles;
import java.util.Scanner;

public class Comprendidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LOS NÚMEROS COMPRENDIDOS¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número comprendido por teclado: " + "\n");
		int numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo número comprendido por teclado: " + "\n");
		int numero2 = entrada.nextInt();
		System.out.println();
		
		if(numero1 != numero2 && numero1 < numero2) {
			for(int i = numero1; i <= numero2; i += 8) {
				System.out.println("Sumandole 8 al número 1 comprendido menor que el segundo: " + i);
			}
		}
		else if(numero2 != numero1 && numero2 < numero1) {
			for(int k = numero2; k <= numero1; k += 8) {
				System.out.println("Sumandole 8 al número 2 comprendido menor que el primero: " + k);
			}
		}
		else {
			System.out.println("Los números introducidos por consola son iguales: " + ", Número 1: " + numero1 + ", Número 2: " + numero2);
		}
		entrada.close();
	}
}
