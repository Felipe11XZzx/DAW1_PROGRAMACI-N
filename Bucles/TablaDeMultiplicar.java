package Bucles;
import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!BIENVENIDO AL PROGRAMA DE LA TABLA DE MULTIPLICAR¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el valor de la tabla de multiplicar: " + "\n");
		int numero = entrada.nextInt();
		System.out.println();
		
		while(numero <= 0 || numero > 10) {
			System.out.println("Introduce un valor entre 1 y 10.");
			System.out.println();
			numero = entrada.nextInt();
			System.out.println();
		}
		
		System.out.println("Tabla de multiplicar del número: " + numero + "\n");
		for(int i = 0; i <= 10; i++) {
			System.out.println(numero + "x" + i + "=" + i * numero);
		}
		entrada.close();
	}
}
