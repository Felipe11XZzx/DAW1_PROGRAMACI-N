package ClaseLinea;

public class MainLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(3, 4);
		Linea l1 = new Linea(punto1, punto2);
		
		Punto punto3 = new Punto(2, 1);
		Punto punto4 = new Punto(4, 3);
		Linea l2 = new Linea(punto3, punto4);
		
		System.out.println("\n" + "Linea Número 1: " +  l1.toString());
		System.out.println("Linea Número 2: " +  l2.toString() + "\n");
		System.out.println("Linea 1 y Linea 2 Son Paralelas? " + Linea.sonParalelas(l1, l2));
	}
}