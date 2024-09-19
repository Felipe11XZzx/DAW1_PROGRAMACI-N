package Arrays;

public class FunciónMáximoValorTabla {

	public static int maximo(int Ptabla []) {
		
		int maximo = 0;
		
		for(int datos : Ptabla) {
			if(datos > maximo) {
				maximo = datos;
			}
		}
		System.out.println();
		return maximo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tabla [] = {99, 555, 11, 0, 77, 8};
		System.out.println("Valor máximo de la tabla: " + maximo(tabla));
	}
}