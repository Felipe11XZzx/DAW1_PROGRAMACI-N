package MercadilloArrays;
import java.util.*;

public class Dorsales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LA MARATÓN DE ZARAGOZA¡" + "\n");
		Scanner numeros = new Scanner(System.in);
		System.out.println("Introduce el dorsal del corredor que ha llegado a la meta: " + "\n" + "(INTRODUCE MENOS UNO -1 PARA SALIR DEL PROGRAMA)" + "\n");
		int tablaDorsales [] = new int [0];
		int dorsales = numeros.nextInt();
		
		// PASO 1 INSERTAR LA CANTIDAD DE DORSALES QUE EL USUARIO ELIGA.
		while(dorsales != -1) {
			tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length + 1);
			tablaDorsales[tablaDorsales.length - 1] = dorsales;
			dorsales = numeros.nextInt();
		}
		System.out.println();
		System.out.println("Tabla con todos los dorsales que llegaron a la meta: " + Arrays.toString(tablaDorsales) + "\n");
		
		// PASO 2 ADELANTAR LOS CORREDORES QUE SON MENORES DE EDAD UNA POSICIÓN MAS.
				
		System.out.println("Introduce los dorsales de los menores de edad para adelantarlos una posición en el ranking por su esfuerzo: " + "\n");
		
		boolean encontrado = false;
		dorsales = numeros.nextInt();
		
		 while(dorsales != -1) {
			 
			 for(int i = 0; i < tablaDorsales.length && !encontrado; i++) {
				 if(tablaDorsales[i] == dorsales) {
					 encontrado = true;
					 
					 if(i > 0) {
						 int temporal = tablaDorsales[i];
						 tablaDorsales[i] = tablaDorsales[i - 1];
						 tablaDorsales[i - 1] = temporal;
						 dorsales = numeros.nextInt();
					 }
				 }
			 }
			 encontrado = false;
		 }
		System.out.println();
		System.out.println("Despues de adelantar los corredores menores de edad: " + Arrays.toString(tablaDorsales) + "\n");
		
		// PASO 3 LOS CORREDORES QUE NO HAN PAGADO EL DORSAL SE ELIMINAN DE LA TABLA.
		
		System.out.println("Introduce los dorsales que han usado quimica para la carrera: " + "\n");
		dorsales = numeros.nextInt();
		
		while(dorsales != -1) {
			
			for(int k = 0; k < tablaDorsales.length && !encontrado; k++) {
				if(tablaDorsales[k] == dorsales) {
					encontrado = true;
					
					if(k != tablaDorsales.length - 1) {
						System.arraycopy(tablaDorsales, k + 1, tablaDorsales, k, tablaDorsales.length - k - 1);
						tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length - 1);
						dorsales = numeros.nextInt();
					}
				}
				encontrado = false;
			}
		}
		System.out.println();
		System.out.println("Tabla de dorsales despues de eliminar los dopados: " + Arrays.toString(tablaDorsales) + "\n");
		
		// PASO 4 MOVER AL FINAL LOS CORREDORES QUE NO HAN PAGADO EL DORSAL EN LA CARRERA.
		
		System.out.println("Introduce los dorsales que no han pagado la inscripción para moverlos al final: " + "\n");
		dorsales = numeros.nextInt();
		
		while(dorsales != -1) {
			
			for(int j = 0; j < tablaDorsales.length && !encontrado; j++) {
				if(tablaDorsales[j] == dorsales) {
					encontrado = true;
					
					if(j != tablaDorsales.length - 1) {
						int temporal = tablaDorsales[j];
						System.arraycopy(tablaDorsales, j + 1, tablaDorsales, j,tablaDorsales.length - j - 1);
						tablaDorsales[tablaDorsales.length - 1] = temporal;
						dorsales = numeros.nextInt();
					}
				}
				encontrado = false;
			}
		}
		System.out.println();
		System.out.println("Despues de mover los mala paga al final de la tabla de corredores: " + Arrays.toString(tablaDorsales) + "\n");
		
		// PASO 5 MOSTRAR EL TOP TRES DE LA MARATÓN DE ZARAGOZA.
		
		int topTres [] = Arrays.copyOfRange(tablaDorsales, 0, 3);
		System.out.println("!TOP TRES DE LA MARATÓN DE ZARAGOZA FELICITACIONES POR SER LOS MEJORES TIEMPOS¡" + "\n" + "\n" + "Medalla de Oro: " + topTres[0] + "\n" + "Medalla de Plata: " + topTres[1] + "\n" + "Medalla de Bronce: " + topTres[2]);
		numeros.close();
	}
}