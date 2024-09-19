package Arrays;
import java.util.Arrays;

public class MostrarTabla3Maneras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String marcasZapatillas [] = {"NIKE", "VAPE", "GUCCI", "SALOMON", "JORDAN"};
		
		System.out.println();
		for(int i = 0; i < marcasZapatillas.length; i++) {
			System.out.print(marcasZapatillas[i] + ", ");
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(marcasZapatillas) + "\n");
		
		for(String marcas : marcasZapatillas) {
			System.out.println(marcas);
		}
	}

}
