package Arrays;
import java.util.Arrays;

public class FunciónEliminarMayores {
	
	public static int[] eliminarMayores(int tabla[], int valor) {
		
	    int i = 0;
	    
	    while (i < tabla.length) {
	        if (valor < tabla[i]) {
	            tabla[i] = tabla[tabla.length - 1];
	            tabla = Arrays.copyOf(tabla, tabla.length - 1);
	        } else {
	            i++;
	        }
	    }
	    System.out.println();
		System.out.println("Primera forma de eliminar mayores: " + Arrays.toString(tabla));
	    return tabla;
	}
	
	public static void eliminar(int tabla[], int valor) {
		
		for(int i = 0; i < tabla.length; i++) {
			if(valor < tabla[i]) {
				tabla[i] = tabla[tabla.length - 1];
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
				i--;
			}
		}
		System.out.println("Segunda forma de eliminar mayores: " + Arrays.toString(tabla));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla[] = {10, 11, 11, 11, 12, 13, 14, 15, 16};
		eliminarMayores(tabla, 11);
		
		eliminar(tabla, 11);
	}

}
