package Condicionales;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DEL BOLETIN DE NOTAS¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la calificaón del alumno: " + "\n");
		int nota = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		if(nota < 0 || nota > 10) {
			System.out.println("!NOTA INVALIDA¡");
		}
		else if(nota >= 0 && nota <= 4) {
			System.out.println("Estas suspendo a estudiar más.");
		}
		if(nota >= 5 && nota <= 8) {
			System.out.println("Estas aprobado enhorabuena.");
		}
		else if(nota == 9 || nota == 10) {
			System.out.println("Estas aprobadisimo eres un superdotado.");
		}
	}

}
