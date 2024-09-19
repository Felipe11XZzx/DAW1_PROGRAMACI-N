package MercadilloArrays;
import java.util.*;

public class MatrizMágica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!BIENVENIDO AL PROGRAMA PARA COMPROBAR SI INTRODUCES POR TECLADO UNA MÁTRIZ MÁGICA¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		final int tamaño = 4;
		int matriz [][] = new int [tamaño][tamaño];
		int sumaColumnas = 0; int sumaFilas = 0; int sumaPrimeraFila = 0;
		boolean magica = true;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int k = 0; k < matriz.length; k++) {
				matriz[i][k] = entrada.nextInt();
			}
		}
		entrada.close();
		System.out.println("\n");
		
		System.out.println("!MÁTRIZ INTRODUCIDA POR TECLADO¡" + "\n");
		for(int [] datos : matriz) {
			System.out.println(Arrays.toString(datos));
		}
		System.out.println();
		
		for(int i = 0; i < tamaño; i++) {
			sumaPrimeraFila += matriz[0][i];
		}
		
		for(int j = 0; j < tamaño; j++) {
			sumaColumnas = 0;
			for(int i = 0; i < tamaño; i++) {
				sumaColumnas += matriz[j][i];
			}
			if(sumaColumnas != sumaPrimeraFila) {
				magica = false;
			}
		}
		
		for(int i = 0; i < tamaño; i++) {
			sumaFilas = 0;
		for(int j = 0; j < tamaño; j++) {
			sumaFilas += matriz[i][j];
		}
		if(sumaFilas != sumaPrimeraFila) {
			magica = false;
			}
		}	
		System.out.println("Suma de las filas: " + sumaFilas + "\n" + "Suma columnas: " + sumaColumnas + "\n");
		
		if(magica) {
			System.out.println("INCREIBLE LA MÁTRIZ QUE INTRODUCISTE POR TECLADO ES MÁGICA" + "\n");
			for(int [] esMagica : matriz) {
				System.out.println(Arrays.toString(esMagica));
			}
		}
		else {
			System.out.println("La mátriz introducida por teclado es una mátriz normal.");
		}
	}
}