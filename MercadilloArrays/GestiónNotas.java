package MercadilloArrays;
import java.util.*;

public class GestiónNotas {
	
	public static int [] ingresarNotas(int tabla[]) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdude las 5 notas del grupo una por una: " + "\n");
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = entrada.nextInt();
		}
		System.out.println();
		return tabla;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int [] notasGrupo1 = new int [5];
		System.out.println("Ingresando las notas del grupo 1: " + "\n");
		ingresarNotas(notasGrupo1);
		System.out.println("Notas del grupo número 1: " + Arrays.toString(notasGrupo1) + "\n");

		final int [] notasGrupo2 = new int [5];
		System.out.println("Ingresando las notas del grupo 2: " + "\n");
		ingresarNotas(notasGrupo2);
		System.out.println("Notas del grupo número 2: " + Arrays.toString(notasGrupo2) + "\n");
		
		final int [] notasGrupo3 = new int [5];
		System.out.println("Ingresando las notas del grupo 3: " + "\n");
		ingresarNotas(notasGrupo3);
		System.out.println("Notas del grupo número 3: " + Arrays.toString(notasGrupo3) + "\n" + "\n");

		double mediaNotasGrupo1 = 0.0;
		double mediaNotasGrupo2 = 0.0;
		double mediaNotasGrupo3 = 0.0;
		
		for(int k = 1; k < notasGrupo1.length - 1; k++) {
			mediaNotasGrupo1 += notasGrupo1[k];
			mediaNotasGrupo2 += notasGrupo2[k];
			mediaNotasGrupo3 += notasGrupo3[k];
		}
		mediaNotasGrupo1 = (mediaNotasGrupo1 / notasGrupo1.length);
		mediaNotasGrupo2 = (mediaNotasGrupo2 / notasGrupo2.length);
		mediaNotasGrupo3 = (mediaNotasGrupo3 / notasGrupo3.length);
		System.out.println("!NOTAS MEDIAS DE LOS 3 GRUPOS¡" + "\n" + "\n" + "Nota media del grupo número 1: " + mediaNotasGrupo1 + " \n" + "Nota media del grupo número 2: " + mediaNotasGrupo2 + "\n" + "Nota media del grupo número 3: " + mediaNotasGrupo3 + "\n");
		
		System.out.println("!¡A CONTINUACIÓN SELECCIONA LA POSICIÓN DEL ALUMNO DEL CUAL QUIERES SABER SU NOTA MEDIA DEL CURSO" + "\n");
		Scanner datos = new Scanner(System.in);
		int posicion = datos.nextInt();
		System.out.println();
		double notaMediaPosicion = (notasGrupo1[posicion] + notasGrupo2[posicion] + notasGrupo3[posicion] / 3.0);
		System.out.println("La nota media del alumno es la posición que introduciste por teclado es: " + notaMediaPosicion);
		datos.close();
	}
}