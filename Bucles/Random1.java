package Bucles;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LOS 20 NÚMEROS ALEATORIOS¡" + "\n");
		for(int i = 1; i <= 20; i++) {
			int rango = (int) (Math.random()* 11);
			System.out.print(rango + "  ");
		}
	}

}
