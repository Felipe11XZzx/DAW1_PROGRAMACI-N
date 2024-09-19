package Bucles;

public class DeletrearStringFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE DELETREAL LA PALABRA EN ORDEN INVERSO¡" + "\n");

		String texto = "Cuenta las letras que tiene este string con un bucle FOR";
		
		for(int i = texto.length() -1; i >= 0; i--) {
			System.out.println(texto.charAt(i));
		}
	}

}
