package Funciones;

public class FunciónAleatorios_1_0 {

	public static void aleatorios(int cantidad, int minimo, int maximo) {
		
		System.out.println("!GENERANDO UNA CANTIDAD DE NUMEROS ALEATORIOS ENTRE LOS RANGOS DE LA FUNCIÓN¡" + "\n");
		for(int i = 0; i < cantidad; i++) {
			int rango = (int) (Math.random() * (maximo - minimo) + minimo);
			System.out.print(rango + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aleatorios(10, 11, 20);
	}
}