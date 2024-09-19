package Funciones;
import java.util.Scanner;

public class FunciónEsVocal {
	
	public static boolean esVocal(String Pletra) {
		
		boolean esVocal = false;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("!INTRODUCE LA LETRA DEL ABECEDARIO PARA COMPROBAR SI ES UNA VOCAL¡" + "\n");
		Pletra = entrada.next();
		System.out.println();
		char vocal = Pletra.charAt(0);
		entrada.close();
		System.out.println("Letra introducida por teclado: " + vocal + "\n");
	
		if(vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' ||
		   vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
			esVocal = true;
		}
		return esVocal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean letra = esVocal("");
		System.out.println("La letra introducida por teclado es una vocal? " + letra);
	}

}
