package Arrays;
import java.util.Scanner;

public class MostrarTablaOrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tamaño que quieres para la tabla: " + "\n");
		int longitud = entrada.nextInt();
		System.out.println();
		int tablaNumeros [] = new int [longitud];
		
		for(int j = 0; j < tablaNumeros.length; j++) {
			System.out.println("Introduce el número que quieres guardar en la tabla: " + "\n");
			tablaNumeros[j] = entrada.nextInt();
			System.out.println();
		}
		entrada.close();

		for(int i = tablaNumeros.length - 1; i >= 0; i--) {
			System.out.print(tablaNumeros[i] + " ");
		}
	}

}
