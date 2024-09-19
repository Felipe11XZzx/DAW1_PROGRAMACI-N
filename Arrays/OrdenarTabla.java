package Arrays;
import java.util.Arrays;

public class OrdenarTabla {

	public static int [] rellenaPares(int longitud, int fin) {
		
		int Ptabla [] = new int [longitud];
		int contador = 0;
		
		while(contador < Ptabla.length) {
			int rango = (int) (Math.random() * (fin + 1));
			if(rango % 2 == 0 && rango >= 2) {
				Ptabla[contador] += rango;
				contador++;
			}
		}
		Arrays.sort(Ptabla);
		System.out.println();
		System.out.println("Tabla de números pares: " + Arrays.toString(Ptabla));
		return Ptabla;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rellenaPares(30, 100);
	}
}
