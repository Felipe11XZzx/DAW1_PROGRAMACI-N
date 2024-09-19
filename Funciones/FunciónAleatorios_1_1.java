package Funciones;

public class FunciónAleatorios_1_1 {

	public static void aleatorios(int cantidad, int minimo, int maximo) {
		
		System.out.println("!GENERANDO UNA CANTIDAD DE NUMEROS ALEATORIOS ENTRE LOS RANGOS DE LA FUNCIÓN¡" + "\n");
		for(int i = 0; i < cantidad; i++) {
			int rango = (int) (Math.random() * (maximo - minimo) + minimo);
			System.out.print(rango + " ");
		}
	}
	
	public static int aleatorios(int PcantidadNumeros) {
		
		System.out.println("!GENERANDO UNA CANTIDAD DE NUMEROS ALEATORIOS EN BINARY CODE DE LA FUNCIÓN¡" + "\n");
		for(int i = 0; i < PcantidadNumeros; i++) {
			int rango = (int) (Math.random() * 2);
			System.out.print(rango + " ");
		}
		return PcantidadNumeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aleatorios(11);
	}

}
