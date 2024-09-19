package Ejercicios19_06_24;

public class Funcion1_3 {
	
	public static int suma(int Pnumero) {
		System.out.println();
		if(Pnumero > 0) {
			for(int i = Pnumero; i > 0; i--) {
				System.out.print(i);
				if(i != 1) {
					System.out.print(" + ");
				}
			}
		}
		else if (Pnumero < 0) {
			System.out.println();
			for(int k = Pnumero; k < 0; k++) {
				System.out.print(k);
				if(k != -1) {
					System.out.print(" + ");
				}
			}
		}
		return Pnumero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		suma(4);
		suma(-3);

	}

}
