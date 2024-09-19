package EvaluacionTrimestre2MainRecuperacion;
import EvaluacionTrimestre2Recuperacion.*;

public class Main_Lavadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lavadora l1 = new Lavadora("LG", 475.55, 270, true);
		System.out.println("\n" + l1.mostrarLavadora() + "\n");
		System.out.println("Dinero consumido con 3 horas de uso: " + l1.getConsumo(3) + "€");
		System.out.println("Dinero conusmido en 3 horas con el importe de la hora: " + l1.getCosteConsumo(3, 0.50) + "€");
	}
}