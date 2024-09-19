package Bucles;
import java.util.Scanner;

public class DatoPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LOS NÚMEROS PERES¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número por teclado: " + "\n");
		int numero = 0;
		System.out.println();
		int contador = 0;
		
		while(numero % 2 == 0) {
			contador++;
			numero = entrada.nextInt();
			System.out.println();
			
			if(numero % 2 == 0) {
				System.out.println("Número par: " + numero + " Cantidad de número pares introducidos: " + contador);
			}
			System.out.println();
		}
		entrada.close();
		System.out.println("Dato impar, fin del programa.");
	}
}