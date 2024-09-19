package Condicionales;

import java.util.Scanner;

public class VentanillaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("!BIENVENIDO AL PROGRAMA DE LA VENTANILLA DEL BANCO¡" + "\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tipo de cilente: " + "\n" + "\n" + "1- Jubilados " + "\n" + "2- Menor de edad " + "\n" + "3- No jubilados ");
		System.out.println();
		int tipoCliente = entrada.nextInt();
		
		System.out.println();
		System.out.println("Introduce la operación a realizar: " + "\n" + "1- Sacar dinero" + "\n" + "2- Ingresar dinero" + "\n");
		int opcionVentanilla = entrada.nextInt();
		System.out.println();
		entrada.close();
		
		
		if(tipoCliente == 1 && (opcionVentanilla == 1)) {
			System.out.println("Tipo cliente 1: Pase por la ventanilla 10 para retirar dinero.");
		}
		else if(tipoCliente == 1 && (opcionVentanilla == 2)) {
			System.out.println("Tipo cliente 1: Ingresar dinero por la ventanilla 11.");
		}
		if(tipoCliente == 2 && (opcionVentanilla <= 0 || opcionVentanilla >= 1)) {
			System.out.println("Menor de edad ve para tu casa chavalin.");
		}
		else if((tipoCliente == 1 || tipoCliente == 3) && (opcionVentanilla <= 0 || opcionVentanilla >= 3)) {
			System.out.println("OPCION INVALIDA.");
		}
		if(tipoCliente == 3 && (opcionVentanilla == 1)) {
			System.out.println("Tipo cliente 3: No puedes sacar dinero en el cajero.");
		}
		else if(tipoCliente == 3 && (opcionVentanilla == 2)) {
			System.out.println("Tipo cliente 3: Ingresar dinero por la ventanilla 12.");
		}
	}
}