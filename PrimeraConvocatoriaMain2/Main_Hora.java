package PrimeraConvocatoriaMain2;
import java.util.*;
import PrimeraConvocatoriaExamen2.Hora;

public class Main_Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Hora hora1 = new Hora();
		System.out.println("Introduce la hora: " + "\n");
		int hora = entrada.nextInt();
		hora1.setHora(hora);
		System.out.println();
		
		System.out.println("Introduce los minutos: " + "\n");
		int minutos = entrada.nextInt(); 
		hora1.setMinutos(minutos);
		System.out.println();
		
		System.out.println("Introduce los segundos: " + "\n");
		int segundos = entrada.nextInt();
		hora1.setSegundos(segundos);
		System.out.println();		
		
		System.out.println("Introduce los segundos que quieres incrementar: " + "\n");
		int n = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Hora: " + hora1.getHora() + ": " + "Minutos: " + hora1.getMinutos() + ": " + "Segundos: " + hora1.getSegundos());
			hora1.incrementarSegundos();
		}
	}
}