package Arrays;

public class ConstruyeUnaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int proteinas [] = new int [10];
		int frutas [] = proteinas;
		int verduras [] = proteinas;
		int mariscos [] = proteinas;
		System.out.println();
		System.out.println("Referencia en memoria de las proteinas: " + proteinas + "\n" + "Referencia en memoria de las frutas: " + frutas + "\n" + "Referencia en memoria de las verduras: " + verduras + "\n" + "Referencia en memoria de los mariscos: " + mariscos);
	}
}