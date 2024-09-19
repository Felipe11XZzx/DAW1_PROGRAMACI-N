package Arrays;

public class Tabla1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabla [] = new int [10];
		int sumaValores = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			int rango = (int) (Math.random()* 101);
			tabla[i] += rango;
			sumaValores += tabla[i];
			System.out.print(tabla[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Suma de los valores de la tabla: " + sumaValores);

	}

}
