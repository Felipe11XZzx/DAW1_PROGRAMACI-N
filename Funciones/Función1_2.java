package Funciones;

import java.util.Scanner;

public class Función1_2 {

	public static double suma(double PnumeroUno, double PnumeroDos) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer número de la suma: " + "\n");
		PnumeroUno = entrada.nextDouble();
		System.out.println();
		
		System.out.println("Introduce el segundo número de la suma: " + "\n");
		PnumeroDos = entrada.nextDouble();
		System.out.println();
		
		double resultado = PnumeroUno + PnumeroDos;
		entrada.close();
		return resultado;
	}
	
	public static boolean parImpar(int Pnumero) {
		
		boolean esPar = true;
		if(Pnumero % 2 == 0) {
			System.out.println("Número Par: " + Pnumero);
		}
		else {
			esPar = false;
			System.out.println("Número impar: " + Pnumero);
		}
		return esPar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = (int) suma(0, 0);
		if(parImpar(resultado));
	}
}