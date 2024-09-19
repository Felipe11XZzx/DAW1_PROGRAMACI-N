package Bucles;
import java.util.Scanner;

public class AciertaElNúmero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE ACIERTA EL NÚMERO¡" + "\n");
		Scanner numero = new Scanner(System.in);
		System.out.println("Introduce tu número de apuesta: " + "\n");
		int apuesta = numero.nextInt();
		System.out.println();
		int numeroSecreto = (int) (Math.random()* (99) +1);
		System.out.println("Secreto: " + numeroSecreto + "\n");
		int intentos = 0;
		
		while(apuesta != -1) {
			
			intentos++;
			
			if(apuesta > numeroSecreto) {
				System.out.println("El número secreto esta en un rango menor." + "\n");
			}
			else if(apuesta < numeroSecreto) {
				System.out.println("El número secreto esta en un rango mayor." + "\n");
			}
			else {
				System.out.println("!FELICIDADES HAS ACERTADO EL NÚMERO SECRETO¡ " + numeroSecreto + " Con esta cantidad de intentos: " + intentos + "\n");
			}
			apuesta = numero.nextInt();
			System.out.println();

		}
		numero.close();
		System.out.println("!TE HAS RENDIDO ERES UN FLOJO¡");
	}

}
