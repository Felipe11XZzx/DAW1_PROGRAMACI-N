package Bucles;
import java.util.Scanner;

public class AprendeAContar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE APRENDER A CONTAR¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número para que aprendas a contar: " + "\n");
		int aprendeAContar = entrada.nextInt();
		System.out.println();
		
		for(int i = 0; i <= aprendeAContar; i++) {
			System.out.print(i + " ");
		}
		entrada.close();
		System.out.println();
	}
}