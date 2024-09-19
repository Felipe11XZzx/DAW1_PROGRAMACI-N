package Condicionales;
import java.util.Scanner;

public class UnSegundoMás {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DEL SEGUNDO MÁS¡");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce las horas: " + "\n");
		int hora = entrada.nextInt();
		System.out.println();
		
		System.out.println("Introduce los minutos: " + "\n");
		int minutos = entrada.nextInt();
		System.out.println();

		System.out.println("Introduce los minutos: " + "\n");
		int segundos = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		if(hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos == 59) {
			minutos++;
			segundos = 0;
			System.out.println("if hora normal aumentando minutos Hora: " + hora + " Minutos: " + minutos + " Segundos: " + segundos + "0");
		}
		else if(hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 58) {
			segundos++;
			System.out.println("else if hora normal incrementando segundos Hora: " + hora + " Minutos: " + minutos + " Segundos: " + segundos);
		}
		if(hora == 24 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 58) {
			hora = 0;
			segundos++;
			System.out.println("if comprobando cambio de hora y segundos Hora: " + hora + "0" + " Minutos: " + minutos + " Segundos: " + segundos);
		}
		else if(hora == 24 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos == 59) {
			hora = 0;
			minutos++;
			segundos = 0;
			System.out.println("if comprobando cambio de hora y aumentando segundos Hora: " + hora + "0"  + " Minutos: " + minutos + " Segundos: " + segundos + "0");
		}
	}
}