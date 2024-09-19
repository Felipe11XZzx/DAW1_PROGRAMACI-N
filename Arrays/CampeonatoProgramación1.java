package Arrays;
import java.util.*;

public class CampeonatoProgramación1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LOS PUNTAJES OBTENIDOS POR LOS PROGRAMADORES¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		int programadores [] = new int [5];
		int contador = 0;
		
		for(int i = 0; i < programadores.length; i++) {
			System.out.println("Introduce la puntuación del programador número: " + (i + 1) + "\n");
			programadores[i] = entrada.nextInt();
			System.out.println();
		}
		Arrays.sort(programadores);
		System.out.println("Puntuacion de los primeros 5 programadores: " + Arrays.toString(programadores) + "\n");
		
		System.out.println("!A CONTINUACIÓN SE UNEN MAS PROGRAMADORES QUE SON LOS DE EXHIBICIÓN¡" + "\n" + "(INTRODUCE -1 PARA DEJAR DE INTRODUCIR PROGRAMADORES DE EXHIBICIÓN)" + "\n");
		int programadoresExhibicion [] = Arrays.copyOf(programadores, programadores.length);
		int puntuacion = entrada.nextInt();
		
		while(puntuacion != -1) {
			contador++;
			System.out.println();
			System.out.println("!INTRODUCE LA PUNTUACIÓN DE EL PROGRAMADOR DE EXHIBICIÓN NÚMERO¡ " + contador + "\n");
			puntuacion = entrada.nextInt();
			System.out.println();
			programadoresExhibicion = Arrays.copyOf(programadoresExhibicion, programadoresExhibicion.length + 1);
			programadoresExhibicion[programadoresExhibicion.length -1] = puntuacion;
		}
		programadoresExhibicion = Arrays.copyOf(programadoresExhibicion, programadoresExhibicion.length - 1);
		Arrays.sort(programadoresExhibicion);
		System.out.println("Puntuaciones de todos los programadores que participaron en el campeonato: " + "\n" + "\n" + Arrays.toString(programadoresExhibicion));
		entrada.close();
	}

}
