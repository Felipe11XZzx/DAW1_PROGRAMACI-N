package Funciones;
import java.util.Scanner;

public class Función1_0 {
	
	public static double suma (double PnumeroUno, double PnumeroDos) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Resultado de la suma: " + suma(0, 0));
	}
}