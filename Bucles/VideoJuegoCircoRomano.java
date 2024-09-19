package Bucles;
import java.util.Scanner;

public class VideoJuegoCircoRomano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BIENVENIDO AL VIDEOJUEGO DEL CIRCO ROMANO VALIENTE LUCHADOR SUERTE PARA LO QUE SE VIENE¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		int hpJugador = 100;
		int asaltos = 0;
		int alturaEscudo;
		int bloqueos = 0;
		int alturaAtaque = (int) (Math.random() * 3);
		int dañoAtaque = (int) (Math.random() * 31);;
		
		while(hpJugador > 0 && asaltos < 25) {
			
			System.out.println("!BIENVENIDO A LA ARENA ESTAS EN EL ASALTO NÚMERO:¡" + " " + asaltos);
			alturaAtaque = (int) (Math.random() * 3);
			dañoAtaque = (int) (Math.random() * 31);;
			System.out.println();
			System.out.println("!CUIDADO VALIENTE EL MONSTRUO VA A HACER SU ATAQUE¡" + "\n");
			System.out.println();
			
			System.out.println("!POSICIONA TU ESCUDO A LA ALTURA DESEADA¡" + "\n" + "\n" + "0- BAJA" + "\n" + "1- MEDIA" + "\n" + "2- ALTA");
			System.out.println();
			System.out.println("Altura Ataque: " + alturaAtaque + "\n");
			System.out.println("Cantidad de bloqueos: " + bloqueos + "\n");
			alturaEscudo = entrada.nextInt();
			
			if(alturaEscudo == alturaAtaque) {
				bloqueos++;
				System.out.println("!ASI SE HACE GUERRERO BLOQUEASTE EL ATAQUE¡" + "\n");
			}
			if(bloqueos == 3) {
				hpJugador += 5;
				System.out.println("!EXECELENTE LE ESTAS DANDO UNA MASTERCLASS DE DEFENSA AL MONSTRUO Y HAS AUMENTADO TU HP¡ " + hpJugador + "\n");
				bloqueos = 0;
			}
			else if (alturaEscudo != alturaAtaque) {
				System.out.println();
				bloqueos = 0;
				hpJugador = hpJugador - dañoAtaque;
				System.out.println("!EL MONSTRUO TE HA HERIDO MALA SUERTE GUERRERO¡" + " DAÑO RECIBIDO: " + dañoAtaque + ", HP RESTANTE DEL GUERRERO: " + hpJugador + "\n");
			}
			asaltos++;
		}
		System.out.println("!NOS CARGO LA VERGA EL MONSTRUO NOS MATO DESCANSA EN PAZ GUERRERO RIP¡" + "\n");
		System.out.println("!SOBREVISTE ESTA CANTIDAD DE ASALTOS GUERRERO¡ " + asaltos);
		entrada.close();
	}
}
