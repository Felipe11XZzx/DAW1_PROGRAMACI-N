package Main_EjerciciosLista;
import EjerciciosLista.Lista;
import java.util.Scanner;

public class Main_Encolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista l1 = new Lista();
		
		System.out.println("!BIENVENIDO AL PROGRAMADE LA LISTA¡ " + "\n" + "(INTRODUCE MENOS UNO PARA DEJAR DE ENCOLAR NÚMEROS EN LA LISTA -1)" + "\n");
		Scanner entrada = new Scanner(System.in);
		Integer numerosLista = entrada.nextInt();
		
		while(numerosLista != -1) {
			l1.encolar(numerosLista);
			numerosLista = entrada.nextInt();
		}
		entrada.close();
		l1.mostrarLista();
		
		while(l1.numeroElementosLista() != 0) {
			l1.desencolar();
			l1.mostrarLista();
		}
	}
}