package Bucles;
import java.util.Scanner;

public class CuadradoAsteriscosFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!BIENVENIDO AL PROGRAMA DE DIBUJAR EL CUADRADO CON ASTERISCOS¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tamaño del cuadro: " + "\n");
		int tamaño = entrada.nextInt();
		System.out.println();
		
		for(int i = 0; i < tamaño; i++) {
			for(int k = 0; k < tamaño; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		entrada.close();
	}

}
