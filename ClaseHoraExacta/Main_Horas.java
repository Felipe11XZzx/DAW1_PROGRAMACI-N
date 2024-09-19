package ClaseHoraExacta;
import ClaseHora.Hora;

public class Main_Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora hora1 = new Hora(99, 99);
		hora1.inc();
		System.out.println("\n" + hora1.toString());
		
		HoraExacta horaExacta1 = new HoraExacta(11, 59, 59);
		horaExacta1.inc();
		System.out.println("\n" + horaExacta1.toString());
		
		System.out.println("\n" + "!Despues de incrementar los segundos¡" + "\n");
		horaExacta1.inc();
		System.out.println(horaExacta1.toString());
	}
}