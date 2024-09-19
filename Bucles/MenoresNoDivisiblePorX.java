package Bucles;
import java.util.Scanner;

public class MenoresNoDivisiblePorX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE NÚMEROS NO DIVISIBLES POR X¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número: " + "\n");
		int numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo número: " + "\n");
		int numero2 = entrada.nextInt();
		
		while(numero1 <= 0 || numero2 <= 0) {
			
			System.out.println();
			if(numero1 <= 0) {
				System.out.println("El número 1 debe ser mayor a cero: " + ", Número 1: " + numero1 + "\n");
				numero1 = entrada.nextInt();
				System.out.println();
			}
			if(numero2 <= 0) {
				System.out.println("El número 2 debe ser mayor a cero: " + ", Número 2: " + numero2 + "\n");
				numero2 = entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Números menores que el primer número: " + numero1 + " , Y que no son divisibles por el segundo número: " + numero2 + "\n");
		
		for(int i = 1; i < numero1; i++) {
			if(i % numero2 != 0) {
				System.out.println(i);
			}
		}
		entrada.close();
	}

}
