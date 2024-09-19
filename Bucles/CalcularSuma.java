package Bucles;
import java.util.Scanner;

public class CalcularSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE EL CALCULO MENTAL DE SUMAS¡" + "\n");
		int numAleatorio1 = (int) (Math.random()* (99) +1);
		int numAleatorio2 = (int) (Math.random()* (99) +1);
		System.out.println("Número aleatorio 1: " + numAleatorio1 + ", Número aleatorio 2: " + numAleatorio2 + "\n");
		int sumaAleatorios = numAleatorio1 + numAleatorio2;
		Scanner numero = new Scanner(System.in);
		System.out.println("Introuduce el resultado de la suma: " + "\n");
		int sumaUsuario = numero.nextInt();
		System.out.println();
		int sumasCorrectas = 0;
		
		do{
			numAleatorio1 = (int) (Math.random()* (99) +1);
			numAleatorio2 = (int) (Math.random()* (99) +1);
			System.out.println("Número aleatorio 1: " + numAleatorio1 + ", Número aleatorio 2: " + numAleatorio2 + "\n");
			sumaAleatorios = numAleatorio1 + numAleatorio2;	
			sumaUsuario = numero.nextInt();
			System.out.println();
			
			if(sumaUsuario == sumaAleatorios) {
				sumasCorrectas++;
			}
		}
		while(sumaUsuario == sumaAleatorios);
		numero.close();
		System.out.println("Has fallado cantidad de sumas realizadas correctamente: " + sumasCorrectas);
	}
}