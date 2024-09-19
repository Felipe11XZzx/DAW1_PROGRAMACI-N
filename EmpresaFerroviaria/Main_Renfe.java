package EmpresaFerroviaria;
import Maquinaria.*;
import Personal.*;

public class Main_Renfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mecanicos mecanico1 = new Mecanicos(especialidadMecanico.ELECTRICIDAD, "Ramón Ochoa", "+34 654 85 41 25");
		Maquinistas maquinista1 = new Maquinistas("Y1514125Z", 2.5055, "Operario De Primera");
		Locomotoras locomotora1 = new Locomotoras("25848412W", 880, mecanico1);
		Trenes tren1 = new Trenes(locomotora1, maquinista1);
		System.out.println("\n" + "Antes de agregar un vagón: " + "\n" + tren1.toString());
		tren1.agregarVagon(111058, 8000, "Carga Larga"+ "\n");
		tren1.agregarVagon(7777410, 4500, "Carga Granel"+ "\n");
		System.out.println("\n" + "Despues de agregar un vagón: " + "\n" + tren1.toString());

	}
}
