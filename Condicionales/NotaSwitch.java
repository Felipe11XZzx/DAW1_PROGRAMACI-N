package Condicionales;
import java.util.Scanner;

public class NotaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!PROGRAMA NOTAS CENTRO EDUCATIVO¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la nota del alumno para calsificarla: " + "\n");
		int nota = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		switch(nota) {
		
		case 0, 1, 2, 3, 4 :
			System.out.println("Estas suspenso estudia más.");
			break;
			
		case 5, 6, 7, 8 :
			System.out.println("Estas aprobado buen trabajo.");
			break;
			
		case 9, 10 :
			System.out.println("Sobresaliente eres un superdotado.");
		
		}
	}
}