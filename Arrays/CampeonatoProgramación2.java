package Arrays;
import java.util.*;

public class CampeonatoProgramación2 {

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
		int puntuacion = entrada.nextInt();
		
		while(puntuacion != -1) {
			contador++;
			
			int insertarOrdenado = Arrays.binarySearch(programadores, puntuacion);
			if(insertarOrdenado < 0) {
				insertarOrdenado =- insertarOrdenado - 1;
			}
			
			int programadoresExhibicion [] = new int [programadores.length + 1];
			System.out.println("!INTRODUCE LA PUNTUACIÓN DE EL PROGRAMADOR DE EXHIBICIÓN NÚMERO¡ " + contador + "\n");
			System.arraycopy(programadores, 0, programadoresExhibicion, 0, insertarOrdenado);
			System.arraycopy(programadores, insertarOrdenado, programadoresExhibicion, insertarOrdenado + 1, programadores.length - insertarOrdenado);
			programadoresExhibicion[insertarOrdenado] = puntuacion;
			programadores = programadoresExhibicion;
			puntuacion = entrada.nextInt();
			System.out.println();
		}
		System.out.println("Puntuaciones de todos los programadores que participaron en el campeonato: " + "\n" + "\n" + Arrays.toString(programadores));
		entrada.close();
	}
}