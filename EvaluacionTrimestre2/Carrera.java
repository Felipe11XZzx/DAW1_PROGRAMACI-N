package EvaluacionTrimestre2;
import java.util.*;

public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dorsales = new Scanner(System.in);
		System.out.println("!BIENVENIDO A LA MARATHON DE ZARAGOZA¡" + "\n" + "(A CONTINUACIÓN INTRODUCE LOS DORSALES DE LOS CORREDORES QUE LLEGARON A LA META PRESIONA MENOS UNO PARA DEJAR DE INTRODUCIR DORSALES -1)" + "\n");
		int numeroDorsal = dorsales.nextInt();
		int tablaDorsales [] = new int [0];
		
		while(numeroDorsal != -1) {
			tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length + 1);
			tablaDorsales[tablaDorsales.length -1] = numeroDorsal;
			numeroDorsal = dorsales.nextInt();
		}
		System.out.println("\n" + "Dorsales que llegaron a la meta: " + Arrays.toString(tablaDorsales) + "\n");
		System.out.println("A CONTINUACIÓN INTRODUCE LOS DORSALES DE LOS MENORES DE EDAD PARA ADELANTARLOS POR SU ESFUERZO" + "\n");
		
		boolean encontrado = false;
		numeroDorsal = dorsales.nextInt();
		
		while(numeroDorsal != -1) {
			for(int i = 0; i < tablaDorsales.length && !encontrado; i++) {
				if(tablaDorsales[i] == numeroDorsal) {
					encontrado = true;
					if(i > 0) {
						int temporal = tablaDorsales[i];
						tablaDorsales[i] = tablaDorsales[i - 1];
						tablaDorsales[i - 1] = temporal;
						numeroDorsal = dorsales.nextInt();
					}
				}
				encontrado = false;
			}
		}
	    System.out.println("\n" + "Tabla de los menores: " + Arrays.toString(tablaDorsales) + "\n");
		System.out.println("A CONTINUACIÓN INTRODUCE LOS DORSALES DE LOS DOPADOS DE EDAD PARA ELIMINARLOS DEL RANKING" + "\n");
		
		numeroDorsal = dorsales.nextInt();

		while(numeroDorsal != -1) {
			for(int k = 0; k < tablaDorsales.length && !encontrado; k++) {
				if(tablaDorsales[k] == numeroDorsal) {
					encontrado = true;
					if(k != tablaDorsales.length - 1) {
						System.arraycopy(tablaDorsales, k + 1, tablaDorsales, k, tablaDorsales.length - k - 1);
						tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length - 1);
						numeroDorsal = dorsales.nextInt();
					}
				}
				encontrado = false;
			}
		}
		System.out.println("\n" + "Tabla despues de eliminar los dopados: " + Arrays.toString(tablaDorsales));
		System.out.println("A CONTINUACIÓN INTRODUCE LOS DORSALES DE LOS QUE NO PAGARON EL DORSAL PARA DESPLAZARLOS AL FINAL DEL RANKING" + "\n");
		
		numeroDorsal = dorsales.nextInt();
		
		while(numeroDorsal != -1) {
			for(int j = 0; j < tablaDorsales.length && !encontrado; j++) {
				if(tablaDorsales[j] == numeroDorsal) {
					encontrado = true;
					if(j != tablaDorsales.length - 1) {
						int moverFinal = tablaDorsales[j];
						System.arraycopy(tablaDorsales, j + 1, tablaDorsales, j, tablaDorsales.length - j - 1);
						tablaDorsales[tablaDorsales.length - 1] = moverFinal;
						numeroDorsal = dorsales.nextInt();
					}
				}
				encontrado = false;
			}
		}
		System.out.println("\n" + "Despues de mover los mala paga al final del ranking: " + Arrays.toString(tablaDorsales) + "\n");
		dorsales.close();
		
		int topTres [] = Arrays.copyOfRange(tablaDorsales, 0, 3);
		System.out.println("!TOP 3 DEL RANKING DE LA MARATÓN DE ZARAGOZA 2024¡" + "\n" + "Medalla Oro: " + topTres[0] + "\n" + "Medalla Plata: " + topTres[1] + "\n" + "Medalla Bronce: " + topTres[2]);
	}
}