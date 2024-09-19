package PrimeraConvocatoriaMain3;
import PrimeraConvocatoriaExamen3.*;
import java.util.ArrayList;

public class Main_Cacharro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafetera c1 = new Cafetera();
		Radio r1 = new Radio();
		System.out.println();
		System.out.println(c1.toString());
		System.out.println(r1.toString() + "\n");

		
		Cafetera c2 = new Cafetera(5000, 'A');
		Radio r2 = new Radio(20, 'A');
		
		System.out.println("El vólumen de las Cafeteras es el mismo? " + c1.equals(c2) + "\n");
		
		ArrayList<EsEco> listaCacharros = new ArrayList<EsEco>();
		listaCacharros.add(c2);
		listaCacharros.add(r2);
		
		double totalAhorroEtiquetaEnergetica = 0;
		for(EsEco cacharros : listaCacharros) {
			System.out.println(cacharros.toString());
			totalAhorroEtiquetaEnergetica += cacharros.getNoAhorro();
		}
		System.out.println();
		System.out.println("Total de ahorro en energia de los cacharros: " + totalAhorroEtiquetaEnergetica + "€");
	}
}