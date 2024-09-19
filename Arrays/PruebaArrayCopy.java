package Arrays;
import java.util.*;

public class PruebaArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {12, 27, 33, 38, 72, 92};
		System.out.println("Tabla antes de eliminar el número 33: " + Arrays.toString(tabla));
		
		int posicionABorrar = Arrays.binarySearch(tabla, 33);
		
		if(posicionABorrar >= 0) {
			System.arraycopy(tabla, posicionABorrar + 1, tabla, posicionABorrar, tabla.length - posicionABorrar - 1);
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
		System.out.println("Tabla despues de eliminar el número 33: " + Arrays.toString(tabla));
	}

}
