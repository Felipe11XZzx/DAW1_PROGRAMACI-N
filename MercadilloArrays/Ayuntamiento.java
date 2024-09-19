package MercadilloArrays;
import java.util.*;

public class Ayuntamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!BIENVENIDO A LA ENCUESTA DE LOS SUELDOS DE NUESTRA LOCALIDAD¡" + "\n" + "(INTRODUCE MENOS UNO, -1 PARA DEJAR DE INTRODUCIR SUELDOS)" + "\n");
		Scanner importe = new Scanner(System.in);
		double sueldo = importe.nextDouble();
		double tablaSueldos [] = new double [0];
		
		// PASO 1 CONTROLAR LA ENTRADA DE SUELDOS EN LA TABLA.
		
		while(sueldo != -1) {
			tablaSueldos = Arrays.copyOf(tablaSueldos, tablaSueldos.length + 1);
			tablaSueldos[tablaSueldos.length - 1] = sueldo;
			sueldo = importe.nextDouble();
		}
		importe.close();
		System.out.println();
		System.out.println("Tabla con todos los sueldos introducidos: " + Arrays.toString(tablaSueldos));
		
		// PASO 2 ORDENAR DE MANERA DECRECIENTE LA TABLA DE LOS SUELDOS.
		
		for(int i = 0; i < tablaSueldos.length; i++) {
			for(int k = 0; k < tablaSueldos.length; k++) {
				if(tablaSueldos[i] > tablaSueldos[k]) {
					double temp = tablaSueldos[i];
					tablaSueldos[i] = tablaSueldos[k];
					tablaSueldos[k] = temp;
				}
			}
		}
		System.out.println("Tabla ordenada de manera decreciente: " + Arrays.toString(tablaSueldos) + "\n");
		
		// PASO 3 MOSTRAR LOS SUELDOS MINIMOS Y MAXIMOS DE LA ENCUESTA.
		
		double sueldoMinimo = tablaSueldos[tablaSueldos.length - 1];
		double sueldoMaximo = tablaSueldos[0];
		System.out.println("Sueldo minimo de la encueta: " + sueldoMinimo + " €" + "\n" + "Sueldo máximo de la encuesta: " + sueldoMaximo + " €" + "\n");
		
		// PASO 4 HACER EL CÁLCULO DE LA MEDIA DE LOS SUELDOS DE LA ENCUESTA.
		
		double mediaSueldos = 0.0;
		
		for(double importeSueldos : tablaSueldos) {
			mediaSueldos += importeSueldos;
		}
		
		double calculoMediaSueldos = (mediaSueldos / tablaSueldos.length);
		System.out.println("Media de los sueldos que se hicieron en la encuesta: " + calculoMediaSueldos + " €");
	}

}
