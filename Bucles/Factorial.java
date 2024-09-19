package Bucles;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DEL NÚMERO FACTORIAL¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el  número por teclado para calcular su factorial: " + "\n");
		int factorial = entrada.nextInt();
		int resultado = 1;
		System.out.println();
		
		for(int i = factorial; i > 0; i--) {
			
			System.out.print(i + "x");
			resultado = resultado * i;
		}
		System.out.println("\n");
		System.out.println("Resultado del factorial del número: " + factorial + " = " + resultado);
		entrada.close();
	}

}
