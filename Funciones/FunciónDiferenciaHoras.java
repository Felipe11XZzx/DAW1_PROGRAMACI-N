package Funciones;

public class FunciónDiferenciaHoras {

	public static int diferenciaMinutos(int Phora1, int Pminutos1, int Phora2, int Pminutos2) {
		
		int horaCompleta1 = Phora1 * 60 + Pminutos1;
		int horaCompleta2 = Phora2 * 60 + Pminutos2;
		int diferenciaMinutos = horaCompleta1 - horaCompleta2;
		
		if(diferenciaMinutos < 0) {
			diferenciaMinutos =- diferenciaMinutos;
		}
		System.out.println();
		
		return diferenciaMinutos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Diferencia de minutos entre los dos instantes: " + diferenciaMinutos(11, 11, 11, 10));
	}

}
