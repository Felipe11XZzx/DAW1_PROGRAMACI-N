package Bucles;

public class DeletraElString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE DELETREAR LA PALABRA¡" + "\n");
		String texto = "Textodelstring";
		int contador = 0;
		int posicion = 0;
		
		while(contador <= texto.length()) {
			contador++;
			char letras = texto.charAt(posicion);
			posicion++;
			System.out.println(letras);
		}
		System.out.println();
		System.out.println("Cantidad de vueltas en el bucle: " + contador);
	}

}