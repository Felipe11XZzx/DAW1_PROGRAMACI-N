package EvaluacionTrimestre2Main;
import EvaluacionTrimestre2.Tortilla;

public class Main_Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tortilla conCebolla = new Tortilla(true, true);
		System.out.println("\n" + conCebolla);
		
		Tortilla sinCebolla = new Tortilla(true, false);
		System.out.println("\n" + sinCebolla);
		
		Tortilla deChorizo = new Tortilla("Chorizo", false);
		System.out.println("\n" + deChorizo);
		
		deChorizo.servirPincho(3);
		System.out.println("\n" + "Cantidad de pinchos disponible de Tortilla de Chorizo: " + deChorizo.pinchosDisponibles());
		
		conCebolla.servirPincho(2);
		System.out.println("\n" + "Cantidad de pinchos disponible de Tortilla de Patata Cebolla: " + conCebolla.pinchosDisponibles());
		
		deChorizo.reponerTortilla();
		System.out.println("\n" + "Despues de reponer la de Chorizo: " + deChorizo.pinchosDisponibles());
		
		System.out.println("\n" + "Info Tortilla Número 1: " + conCebolla);

	}
}