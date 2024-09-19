package Arrays;
import java.util.*;

public class CámaraSecreta {
	
		public static int [] claveSecreta(int tabla[]) {
			
			for(int i = 0; i < tabla.length; i++) {
				final int rangoClave = (int) (Math.random() * 6);
				tabla[i] = rangoClave;
			}
			return tabla;
		}
		
		public static void pistasClave(int tablaApuesta [], int tablaSecreta[]) {
			
			for(int i = 0; i < tablaApuesta.length; i++) {
				if(tablaApuesta[i] > tablaSecreta[i]) {
					System.out.println("El número de la combinacion esta en un rango menor: " + tablaApuesta[i]);
				}
				else if(tablaApuesta[i] < tablaSecreta[i]) {
					System.out.println("El número de la combinacion esta en un rango mayor: " + tablaApuesta[i]);
				}
				else {
					System.out.println("Los números son iguales: " + tablaApuesta[i]);
				}
			}
			System.out.println();
		}
		
		public static int [] numerosApuesta(int tablaApuesta[]) {
			
			@SuppressWarnings("resource")
			Scanner datos = new Scanner(System.in);
			System.out.println();
			System.out.println("Introduce los números de la tabla de apuesta: " + "\n");
			
			for(int k = 0; k < tablaApuesta.length; k++) {
				tablaApuesta[k] = datos.nextInt();
			}
			System.out.println();
			return tablaApuesta;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LA CÁMARA SECRETA¡" + "\n");
		System.out.println("INTROUCE LA LONGITUD DE LA COMBINACIÓN SECRETA Y DE LA APUESTA QUE QUIERAS HACER" + "\n");
		Scanner entrada = new Scanner(System.in);
		int longitud = entrada.nextInt();
		System.out.println();
		
		int combiSecreta [] = new int [longitud];
		claveSecreta(combiSecreta);
		System.out.println("Combinación Secreta: " + Arrays.toString(combiSecreta) + "\n");
		
		
		int combiApuesta [] = new int [longitud];
		
		while(!Arrays.equals(combiApuesta, combiSecreta)) {
			numerosApuesta(combiApuesta);
			pistasClave(combiApuesta, combiSecreta);
		}
		entrada.close();
		System.out.println("!HAS ACERTADO LA COMBINACIÓN SECRETA¡" + " " + Arrays.toString(combiApuesta));
	}
}