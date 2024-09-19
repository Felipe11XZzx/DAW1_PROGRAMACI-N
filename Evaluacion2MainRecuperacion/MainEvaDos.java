package Evaluacion2MainRecuperacion;
import java.util.*;

import Evaluacion2Recuperacion.Hora;
public class MainEvaDos {

	public static void main(String[] args) {
		/* Se pide que implementes las funciones que están fuera del main 
		 * atendiendo a su enunciado concreto.
		 * 
		 * Sólo puedes escribir dentro del cuerpo de las funciones correspondientes a
		 * cada ejercicio y en la clase Hora.
		 * 
		 * Importa las clases mínimas que necesites
		 * 
		 * Cuando trabajamos con tablas adecuamos en todo momento su longitud al número de elementos que
		 * contiene dicha tabla.
		 * 
		 * Se ejecutará el main para comprobar el funcionamiento correcto de cada función.
		 * 
		 */
		//EN EL MAIN NO PUEDES ESCRIBIR NADA
		
		
		funcionParaQuePruebesTusFunciones();
	}
	static void funcionParaQuePruebesTusFunciones() {
		//Si necesitas probar tus funciones implementa aquí lo que quieras
		
		// TABLAS PRUBA FUNCIONES.
		//int tabla[] = {10, 9, 11, 14, 55, 12};
		//int copia[] = {10, 9, 14, 55, 12, 11};
		
		// FUNCIÓN ELIMINAR MAYORES.
		//eliminaMayores(tabla, 11);
		
		// FUNCIÓN MÁXIMO VALOR.
		//System.out.println("\n" + "Valor máximo: " + maximo(tabla));
		
		// FUNCIÓN IGUALES.
		//System.out.println("\n" + "Las tablas son iguales? " + iguales(copia, tabla));
		
		// FUNCIÓN BUSCAR TODOS.
		//int tabla[] = {10, 9, 11, 14, 55, 10};
		//buscarTodos(tabla, 10);
		
		// FUNCIÓN HORA.
		incrementarHora(0, 0, 0);
		
		
	}
	
	
	static int [] eliminaMayores(int t[],int valor) { 
		/* EJERCICIO 1 (2 PUNTOS)
		 * Escribir la función: int[] eliminarMayores (int t[], int valor) que
		 * devuelve la tabla 't' en la que se han eliminado todos los elementos que son mayores que 'valor'.
		 * 
		 * t es una tabla en la que NO importa el orden de sus registros
		 */
		for(int i = 0; i < t.length; i++) {
			if(t[i] > valor) {
				t[i] = t[t.length - 1];
				t = Arrays.copyOf(t, t.length - 1);
				i--;
			}
		}
		System.out.println("Tabla eliminando los mayores: " + Arrays.toString(t));
		return t;
	}
	
	
	static int maximo (int t[]) {
		/*EJERCICIO 2 (1 PUNTO)
		 * Diseñar la función: int maximo(int t[]), que devuelve el máximo valor contenido en la tabla 't'
		 */
		int maximo = 0;
		for(int valores : t) {
			if(valores > maximo) {
				maximo = valores;
			}
		}
		return maximo;
	} 
	
	
	static boolean iguales(int [] a, int [] b) {
		
		/* EJERCICIO 3 (2 PUNTO)
		 * Dos tablas se consideran iguales si contienen los mismos elementos 
		 * en el mismo orden. Implementa la función iguales para que devuelva true
		 * si son iguales las dos tablas o false en caso contrario(no usar el método
		 * equals)
		 */
		boolean iguales = true;
		if(a.length != b.length) {
			iguales = false;
		}
		else {
			for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					iguales = false;
				}
			}
		}
		return iguales;
	}
	
	static int [] buscarTodos (int t[], int clave){
		
		/* EJERCICIO 4 (2 PUNTOS)
		 * Realiza la función: int[] buscarTodos (int t[], int clave), que crea y 
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra la 
		 * clave de búsqueda. En el caso de que clave no se encuentre en la tabla t, la 
		 * función devolverá una tabla vacía.
		 */
		int tablaIndices [] = new int [0];
		for(int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				tablaIndices = Arrays.copyOf(tablaIndices, tablaIndices.length + 1);
				tablaIndices[tablaIndices.length - 1] = i;
			}
		}
		System.out.println("\n" + "Tabla con los indices de las claves: " + Arrays.toString(tablaIndices));
		return tablaIndices;
	}
	
	static void incrementarHora(int hora, int minutos, int segundos) {
		/* EJERCICIO 5 (3 PUNTOS)
		 * Implementa esta función para que lea por teclado 3 enteros
		 * que conformarán una hora cualquiera dada en HORAS, MINUTOS y SEGUNDOS y un número n 
		 * entero. (Se pedirán 4 enteros)
		 * 		 
		 * El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo. 
		 * 
		 * Para ello has de diseñar previamente la clase 'Hora' que dispone de los atributos hora, minuto, segundo. 
		 * Los valores de los atributos se controlarán mediante métodos set/get. 
		 * Dichos atributos se inicializarán a los valores por defecto a la hora de crear un objeto de tipo 'Hora'.
		 * 
		 * La clase Hora dispondrá de un método 'void incrementaSegundo()' que es el encargado de aumentar en 1 segundo dicha hora.
		 * 
		 * ej: para Horas= 12, Minutos = 30, Segundos = 20 y n = 3, el programa debe mostrar:
		 * 12:30:20
		 * 12:30:21
		 * 12:30:22
		 * 12:30:23
		 */
		Hora hora1 = new Hora();
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n" + "Introduce las horas: " + "\n");
		hora = entrada.nextInt();
		hora1.setHora(hora);
		System.out.println();
		
		System.out.println("\n" + "Introduce los minutos: " + "\n");
		minutos = entrada.nextInt();
		hora1.setMinutos(minutos);
		System.out.println();
		
		System.out.println("\n" + "Introduce los segundos: " + "\n");
		segundos = entrada.nextInt();
		hora1.setSegundos(segundos);
		System.out.println();
		
		System.out.println("\n" + "Introduce los segundos que quieres incrementar: " + "\n");
		int incrementarSegundos = entrada.nextInt();
		System.out.println();	
		
		for(int i = 0; i <= incrementarSegundos; i++) {
			System.out.println("Hora: " + hora1.getHora() + " Minutos: " + hora1.getMinutos() + " Segundos: " + hora1.getSegundos());
			hora1.incrementarSegundo();
		}
		entrada.close();
	}
}