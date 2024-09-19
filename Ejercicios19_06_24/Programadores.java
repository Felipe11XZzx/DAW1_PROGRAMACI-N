package Ejercicios19_06_24;
import java.util.*;

public class Programadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL CAMPEONATO DE PROGRAMACIÓN¡" + "\n" + "INTRODUCE LAS PRIMERAS 5 PUNTUACIONES" + "\n");
		Scanner entrada = new Scanner(System.in);
		int tablaProgramadores [] = new int [5];
		
		for(int i = 0; i < tablaProgramadores.length; i++) {
			System.out.println("\n" + "Introduce la puntuación del programador número: " + (i + 1) + "\n");
			tablaProgramadores[i] = entrada.nextInt();
		}
		Arrays.sort(tablaProgramadores);
		System.out.println("\n" + "Tabla programadores anfritiones: " + Arrays.toString(tablaProgramadores));
		
		System.out.println("\n" + "!A CONTINUACIÓN SE UNEN PROGRAMADORES DE EXHIBICIÓN AL CAMPEONATO¡" + "\n" + "(INTRODUCE MENOS UNO, -1 PARA DEJAR DE INTRODUCIR PROGRAMADORES DE EXHIBICION)" + "\n");
		int puntosExhibicion = entrada.nextInt();
		
		while(puntosExhibicion != -1) {
		    int poscionInsertar = Arrays.binarySearch(tablaProgramadores, puntosExhibicion);
		    
		    if(poscionInsertar < 0) {
		        poscionInsertar = -poscionInsertar - 1;
		    }
		        tablaProgramadores = Arrays.copyOf(tablaProgramadores, tablaProgramadores.length + 1);
		        System.arraycopy(tablaProgramadores, poscionInsertar, tablaProgramadores, poscionInsertar + 1, tablaProgramadores.length - poscionInsertar - 1);
		        tablaProgramadores[poscionInsertar] = puntosExhibicion;
		        puntosExhibicion = entrada.nextInt();
		}
		entrada.close();
		System.out.println("\n" + "!TABLA CON TODAS LAS PUNTUACIONES DE LOS PROGRAMADORES¡" + "\n" + "\n" + Arrays.toString(tablaProgramadores));
	}

}
