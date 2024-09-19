package Bucles;
import java.util.Scanner;

public class RecuentoPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!BIENVENIDO AL PROGRAMA DE RECUENTO DE NÚMEROS POSITIVOS Y NEGATIVOS¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		int numerosNegativos = 0;
		int numerosPositivos = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Introduce por teclado el número deseado: " + "\n");
			int numero = entrada.nextInt();
			System.out.println();
			
			if(numero > 0) {
				numerosPositivos++;
			}
			else if(numero < 0) {
				numerosNegativos++;
			}
		}
		entrada.close();
		System.out.println("Cantidad de números enteros introducidos: " + numerosPositivos);
		System.out.println("Cantidad de números negativos introducidos: " + numerosNegativos);
	}
}