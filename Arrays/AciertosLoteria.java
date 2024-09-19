package Arrays;
import java.util.Arrays;

public class AciertosLoteria {

	public static int aciertosLoteria(int Bprimitiva [], int Bapuesta []) {
		
		int cantidadAciertos = 0;
		for(int i = 0; i < Bprimitiva.length; i++) {
			if(Arrays.binarySearch(Bapuesta, Bprimitiva[i]) >= 0) {
				cantidadAciertos++;
			}
		}
		System.out.println();
		return cantidadAciertos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tablaApuesta [] = {14, 16, 27, 78, 41, 32};
		int tablaPrimitiva [] = {14, 16, 27, 32, 41, 72};
		System.out.println("Cantidad de aciertos en tu boleto de loteria: " + aciertosLoteria(tablaApuesta, tablaPrimitiva));
	}

}
