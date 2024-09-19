package Recursividad;
import java.util.*;
public class ElevarUnaPotencia {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		


		Scanner Dat = new Scanner (System.in);
		
		System.out.println("Introduce El Numero: ");
		long Numero = Dat.nextInt();
		
		System.out.println("Introduce La Base Del Numero: ");
		long Potencia = Dat.nextInt();
		
		long Resultado = Elevar (Numero, Potencia);
		System.out.println("El Resultado Es: " + Resultado);	
		
		Dat.close();
	}

	
	public static long Elevar (long Numero, long Potencia) {
		
				
		if (Potencia == 0) {
			
			return 1;
		}
		
		else  {
			return Numero * Elevar (Numero, Potencia -1);
		}
	
	}
}