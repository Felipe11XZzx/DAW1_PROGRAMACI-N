package Arrays;
import java.util.Arrays;

public class FunciónSinRepetidos {

	public static int [] sinRepetidos(int Ptabla[]) {
		
		int sinRepetidos [] = new int [0];
		
		for(int numeros : Ptabla) {
			if(Arrays.binarySearch(sinRepetidos, numeros) < 0) {
				sinRepetidos = Arrays.copyOf(sinRepetidos, sinRepetidos.length + 1);
				sinRepetidos[sinRepetidos.length - 1]= numeros;
			}
		}
		System.out.println();
		Arrays.sort(sinRepetidos);
		System.out.println("Tabla eliminando los valores repetidos: " + Arrays.toString(sinRepetidos));
		return sinRepetidos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {10, 10, 11, 11, 11, 9, 12, 0};
		sinRepetidos(tabla);
	}
}