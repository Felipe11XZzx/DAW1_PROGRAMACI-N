package Evaluacion3;
import java.util.ArrayList;
import java.time.LocalDate;

import Evaluacion3Mantenimiento.*;

public class Main_Examen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();

		b1.encenderBombilla();
		b2.apagarBombilla();
		System.out.println("Esta encendida la bombilla 1: " + b1.encendida() + "\n" + "Esta encendida la bombilla 2: " + b2.encendida() + "\n");
		
		Bombilla.cuadroElectrico = false;
		System.out.println("Estado de la bombilla 1: " + b1.estadoBombilla() + "\n" + "Estado de la bombilla 2: " + b2.estadoBombilla() + "\n");
		
		Bombilla.cuadroElectrico = true;
		System.out.println("Estado de la bombilla 1: " + b1.estadoBombilla() + "\n" + "Estado de la bombilla 2: " + b2.estadoBombilla() + "\n");
		
		TrabajoPintura pintura1 = new TrabajoPintura("Rodrigo Ayala", LocalDate.of(2024, 7, 11), "AlCampo S.A", 40, 150);
		TrabajoPintura pintura2 = new TrabajoPintura("Oscar Contreras", LocalDate.of(2024, 6, 16), "Mercadona S.A", 80, 150);
		RevisionAlarma revision1 = new RevisionAlarma(LocalDate.of(2021, 5, 5), "Ayuntamiento Zaragoza", 11);
		RevisionAlarma revision2 = new RevisionAlarma(LocalDate.of(2015, 10, 9), "Ayuntamiento Calatayud", 4);
		RevisionAlarma revision3 = new RevisionAlarma(LocalDate.of(2023, 1, 21), "Ayuntamiento Valencia", 40);
		
		ArrayList<Servicio> listaTrabajos = new ArrayList<Servicio>();
		listaTrabajos.add(pintura1);
		listaTrabajos.add(pintura2);
		listaTrabajos.add(revision1);
		listaTrabajos.add(revision2);
		listaTrabajos.add(revision3);		
		
		double costeTotalTrabajos = 0;
		double costeTotalManoObra = 0;
		
		for(Servicio datos : listaTrabajos) {
			costeTotalTrabajos += datos.costeTotal();
			costeTotalManoObra += datos.costeManoObra();
			System.out.println(datos.detalleServicio());
		}
		System.out.println("Total coste de trabajos realizados: " + costeTotalTrabajos + "€" + "\n" + "Total coste mano de obra trabajores: " + costeTotalManoObra + "€");
	}
}