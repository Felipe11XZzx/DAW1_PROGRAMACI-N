package SupermercadoMain;
import java.time.LocalDate;
import ClasesSupermercado.*;
import InterfacesSupermercado.IEsAlimento;

import java.util.ArrayList;

public class PolimorfismoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vino v1 = new Vino("Don Peri", "Blanco", 50, 8000);
		v1.setCaducidad(LocalDate.of(2031, 6, 21));
		v1.setVolumen(1500);
		v1.setTipoEnvase("Edición Deluxe");
		
		Cereales c1 = new Cereales("Kellogs", "Maiz", 5.78);
		c1.setCaducidad(LocalDate.of(2024, 11, 11));
		
		int caloriasTotales = 0;
		
		ArrayList<IEsAlimento> listaAlimentos = new ArrayList<IEsAlimento>();
		listaAlimentos.add(c1);
		listaAlimentos.add(v1);
		
		for(IEsAlimento comida : listaAlimentos) {
			caloriasTotales += comida.getCalorias();
			System.out.println();
			System.out.println(comida.toString());
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("\n" + "Calorias totales de los alimentos: " + caloriasTotales + " Calorias.");
	}
}