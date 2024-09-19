package Bucles;
import java.util.Scanner;

public class ElevarUnNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE ELEVAR UN NÚMERO¡"+  "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el exponente por teclado: " + "\n");
		int exponente = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce la base por teclado: " + "\n");
		int base = entrada.nextInt();
		System.out.println();
		int resultado = 1;
		int contador = 0;
		int vueltas = 0;
		
		while(contador < exponente && exponente >= 1) {
			contador++;	
			resultado *= base;
			vueltas++;
			System.out.print("El Bucle Se Repite Numero De Veces: " + vueltas);
			System.out.println();
		}
		entrada.close();
		System.out.println();
		System.out.println("El Resultado Es: "+ resultado);
	}
}