package Evaluacion1Recuperacion;
import java.util.*;

public class MainEvaUno {

	public static void main(String[] args) {
		
		/* Se pide que implementes las funciones que están fuera del main 
		 * atendiendo a su enunciado concreto.
		 * 
		 * Importa las clases mínimas que necesites
		 * 
		 * Sólo puedes escribir dentro del cuerpo de las funciones correspondientes a
		 * cada ejercicio.
		 * 
		 * Se ejecutará el main para comprobar el funcionamiento correcto de cada función.
		 * 
		 */
		//EN EL MAIN NO PUEDES ESCRIBIR

		funcionParaQuePruebesTusFunciones();
	}
	
	static void funcionParaQuePruebesTusFunciones() {
		//Si necesitas probar tus funciones implementa aquí lo que quieras
	
		//menores();
		numerosEnterosComprendidos();
		//diferenciaMinutos(12,30,2,55);
		//diferenciaMinutos(1,30,2,55);
		//numeroSecreto();
		//numerosAleatorios();
	}
	
	static void menores() {
		/* EJERCICIO 1 (2 PUNTO)
		 * Implementa la función para que devuelva por consola todos 
		 * los múltiplos de 7 menores de 1000.
		 */
		System.out.println("INICIO MENORES");
		for(int i = 7; i < 1000; i += 7) {
			System.out.println(i);
		}
		System.out.println("FIN MENORES\n");
	}
	
	
	 
	
	static void numeroSecreto() {
		 /* EJERCICIO 2 (2 PUNTOS)
		 * 
		 * Implementa esta función para que recree el juego "número secreto",
		 * que consiste en acertar un número entre 0 y 100 (generado aleatoriamente). 
		 * 
		 * Para ello se van introduciendo por teclado una serie de números (de uno en uno)
		 * para los que el programa nos da la pista si el número a acertar es mayor o menor.
		 * 
		 * El proceso termina cuando el usuario acierta el número (debe indicarse que el
		 * número ha sido acertado y el número total de intentos realizados)o cuando se 
		 * rinde (introduciendo un -1 para rendirse y mostrando el número de intentos realizados).
		 */
		 System.out.println("INICIO NUMEROSECRETO");
		 
		 int numeroAleatorio = (int) (Math.random() * 101);
		 System.out.println(numeroAleatorio);
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("!INTRODUCE EL NÚMERO DE APUESTA¡" + "\n");
		 int apuesta = entrada.nextInt();
		 int intentos = 0;
		 
		 while(apuesta != -1) {
			 intentos++;
			 if(apuesta > numeroAleatorio) {
				 System.out.println("El Número se encuentra en un rango menor.");
			 }
			 else if(apuesta < numeroAleatorio) {
				 System.out.println("El Número se encuentra en un rango mayor.");
			 }
			 else {
				 System.out.println("Los Números son iguales: " + "\n" + "Número Secreto: " + numeroAleatorio + "\n" + "Número Apuesta: " + apuesta + "\n" + "Cantidad de intentos: " + intentos);
			 }
			 apuesta = entrada.nextInt();
		 }
		 entrada.close();
		 System.out.println("Te has rendido eres un flojo: " + "Cantidad de intentos: " + intentos);
		 System.out.println("FIN NUMEROSECRETO\n");
	 }
	

	 
	
	static void numerosEnterosComprendidos() {
		 /* EJERCICIO 3 (2PUNTOS)
		  * Escribe un programa que obtenga números enteros comprendidos entre 
		  * dos números introducidos por teclado y validados como distintos, el programa 
		  * debe empezar por el menor de los enteros introducidos e ir incrementando de 8 en 8.
		  */
		 System.out.println("INICIO NUMEROSENTEROSCOMPRENDIDOS");
		
		 @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce el primer número: " + "\n");
		 int numero1 = entrada.nextInt();
		 System.out.println();
		 
		 System.out.println("Introduce el segundo número: " + "\n");
		 int numero2 = entrada.nextInt();
		 System.out.println();
		 
		 while(numero1 <= 0 || numero2 <= 0) {
			 if(numero1 <= 0) {
				 System.out.println("Numero 1 invalido, Introduce un número valido mayor a 0.");
				 numero1 = entrada.nextInt();
			 }
			 if(numero2 <= 0) {
				 System.out.println("Numero 2 invalido, Introduce un número valido mayor a 0.");
				 numero2 = entrada.nextInt();
			 }
		 }
		 
		 if(numero1 != numero2 && numero1 < numero2) {
			 System.out.println("Incrementando el número 1 de ocho en ocho: " + "\n");
			 for(; numero1 < numero2; numero1 += 8) {
				 System.out.println(numero1);
			 }
		 }
		 
		 else if(numero2 != numero1 && numero2 < numero1) {
			 System.out.println("Incrementando el número 2 de ocho en ocho: " + "\n");
			 for(; numero2 < numero1; numero2 += 8) {
				 System.out.println(numero2);
			 }
		 }
		 entrada.close();
		 System.out.println("FIN NUMEROSENTEROSCOMPRENDIDOS\n");
	 }
	
	static void numerosAleatorios() {
		 /* EJERCICIO 4 (2 PUNTOS)
		  * Muestra 20 números enteros aleatorios entre -100 y 100 (el primero incluido) separados por espacios.
		  */
		 System.out.println("INICIO NUMEROSALEATORIOS");
		 for(int i = 0; i < 20; i++) {
			 int rango = (int)(Math.random() * -201) + 100;
			 System.out.print(rango + " ");
		 }
		 System.out.println("FIN NUMEROSALEATORIOS\n");
	 }
	 
	 
	 
	
	
	static void diferenciaMinutos(int hora1, int minuto1, int hora2, int minuto2) {
		 /* EJERCICIO 5 (2 PUNTO)
		  * Diseña la función a la que se le pasan las horas y minutos de dos instantes de tiempo.
		  * La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes.
		  */
		 System.out.println("INICIO DIFERENCIAMINUTOS");
		 
		 int horaCompleta1 = hora1 * 60 + minuto1;
		 int horaCompleta2 = hora2 * 60 + minuto2;
		 int diferenciaTiempo = horaCompleta1 - horaCompleta2;
		 
		 if(diferenciaTiempo < 0) {
			 diferenciaTiempo = diferenciaTiempo - 1;
		 }
		 System.out.println(diferenciaTiempo);
		 System.out.println("FIN DIFERENCIAMINUTOS\n");
		}
}






























