package Condicionales;
import java.util.Scanner;

public class UnDíaMás {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DEL DÍA MÁS¡");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el día: " + "\n");
		int dia = entrada.nextInt();
		System.out.println();
		
		System.out.println("Introduce el mes: " + "\n");
		int mes = entrada.nextInt();
		System.out.println();

		System.out.println("Introduce el año: " + "\n");
		int año = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		// COMPROBACIÓN DE FECHAS INVALIDAS.
		
		if(dia >= 32 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 12)) {
			System.out.println("!FECHA INVALIDA¡");

		}
		
		if(dia >= 30 && (mes == 2 && año > 0 && año <= 10000)) {
			System.out.println("!FECHA INVALIDA¡");
		}
		
		if(dia >= 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11 && año > 0 && año <= 10000)) {
			System.out.println("!FECHA INVALIDA¡");
		}
		
		// MESES DE 31 DÍAS ESTA GUCCI.

		if(dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 && año > 0 && año <= 10000)) {
			mes++;
			dia = 1;
			System.out.println("Fecha actual cambiando meses de 31:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);
		}
		else if(dia >= 1 && dia <= 30 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 12 && año > 0 && año <= 10000)) {
			dia++;
			System.out.println("Fecha actual cambiando el dia:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);

		}
		else if(dia == 31 && (mes == 12 && año > 0 && año <= 10000)) {
			dia = 1;
			mes = 1;
			año++;
			System.out.println("Fecha actual cambiando de año en el mes 12:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);
		}
		
		// MESES DE 29 DÍAS GUCCI.
		
		else if(dia == 29 && mes == 2 && año > 0 && año < 10000) {
			mes++;
			dia = 1;
			System.out.println("Fecha actual cambiando del mes 2 al mes 3:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);
		}
		else if(dia >= 1 && dia <= 28 && (mes == 2 && año > 0 && año <= 10000)) {
			dia++;
			System.out.println("Aumentando diás en febrero:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);
		}
		
		// MESES DE 3O DÍAS GUCCI.
		
		else if(dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11 && año > 0 && año <= 10000)) {
			dia = 1;
			mes++;
			System.out.println("Cambio de meses en meses de 30 dias:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);

		}
		else if(dia >= 1 && dia <= 29 && (mes == 4 || mes == 6 || mes == 9 || mes == 11 && año > 0 && año <= 10000)) {
			dia++;
			System.out.println("Aumentando diás en meses de 30 días:" + " Día: " + dia + " Mes: " + mes + " Año: " + año);
		}
	}

}
