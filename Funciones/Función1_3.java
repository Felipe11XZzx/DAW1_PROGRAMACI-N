package Funciones;
import java.util.Scanner;

public class Función1_3 {

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
		System.out.println();
		return esPar;
	}
	
	public static int suma(int Pnumero) {
		
		if(Pnumero > 0) {
		for(int i = Pnumero; i > 0; i--) {
			System.out.print(i);
			if(i != 1) {
			System.out.print(" + ");
				}
			}
			System.out.println();
		}
		else{
			for(int k = Pnumero; k < 0; k++) {
				System.out.print(k);
				if(k != -1) {
					System.out.print(" + ");
				}
			}
			System.out.println();
		}
		System.out.println();
		return Pnumero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CASTEANDO LA FUNCIÓN SUMA DE DOBLE A ENTERO Y COMPROBANDO SI LA SUMA DA COMO RESULTADO UN NÚMERO PAR.
		int resultado = (int) suma(0, 0);
		if(parImpar(resultado));
		
		// FUNCIÓN PARA MOSTRAR LA SUMA DE LOS NÚMEROS.
		suma(4);
		suma(-3);
	}
}