package Funciones;

public class FunciónDivisoresPrimos {

	public static boolean esPrimo(int Pnumero) {
		
		boolean esPrimo = true;
		int contador = 2;
		
		if(Pnumero < 2) {
			esPrimo = false;
		}
				
		while(contador < Pnumero && esPrimo == true) {
			if(Pnumero % contador == 0) {
				esPrimo = false;
			}
			contador++;
		}
		return esPrimo;
	}
	public static int divisoresPrimos(int Pnumero) {
		
		int cantidadDivisores = 0;
		for(int i = 2; i <= Pnumero; i++) {
			if(Pnumero % i == 0 && esPrimo(i)) {
				cantidadDivisores++;
			}
		}
		return cantidadDivisores;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++) {
			int listaNumeros = divisoresPrimos(i);
			System.out.println("Número: " + i + ", Cantidad de divisores primos: " + listaNumeros);
		}
	}

}
