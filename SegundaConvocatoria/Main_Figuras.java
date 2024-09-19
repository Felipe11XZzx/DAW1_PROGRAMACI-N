 package SegundaConvocatoria;

public class Main_Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodoPruebaColeccionFiguras();
	}
	
	static void MetodoPruebaColeccionFiguras() {
		
		/*
		 * //1 (2 puntos) Cree una colección con la temática que usted elija compuesta
		 * por 5 figuras de tamaños pequeño y grande (Utilice los dos constructores de
		 * la clase Dimension)
		 */
		
		Superheroe s1 = new Superheroe("El Hombre Araña");
		s1.setDescripcionHeroe("The GOAT");
		Dimension d1 = new Dimension(350, 150, 170);
		Figura f1 = new Figura("11111Z", 350, d1, s1);
		
		Superheroe s2 = new Superheroe("Duende Verde");
		s2.setDescripcionHeroe("Norman Osborn");
		s2.setTieneCapa(true);
		Dimension d2 = new Dimension(350, 150, 170);
		Figura f2 = new Figura("222222T", 199, d2, s2);
		
		Superheroe s3 = new Superheroe("Venom");
		s3.setDescripcionHeroe("El Fucking Animal");
		Dimension d3 = new Dimension(350, 150, 170);
		Figura f3 = new Figura("333333K", 180, d3, s3);
		
		Superheroe s4 = new Superheroe("Gatubela");
		s4.setDescripcionHeroe("La Jeva De Peter");
		Dimension d4 = new Dimension(350, 150, 170);
		Figura f4 = new Figura("444444L", 180, d4, s4);
		
		Superheroe s5 = new Superheroe("Misterio");
		s5.setDescripcionHeroe("The Amazing Judini");
		s5.setTieneCapa(true);
		Dimension d5 = new Dimension(350, 150, 170);
		Figura f5 = new Figura("444444W", 180, d5, s5);
		
		Coleccion SpiderMan = new Coleccion("EL ESPECTACULAR HOMBRE ARAÑA");
		SpiderMan.agragarFigura(f1);
		SpiderMan.agragarFigura(f2);
		SpiderMan.agragarFigura(f3);
		SpiderMan.agragarFigura(f4);
		SpiderMan.agragarFigura(f5);
		System.out.println(SpiderMan.mostrarFiguras());
		
		//2 (0,5 puntos) Suba el precio un 10% (calcule esa cifra) a la primera figura que creó.
		
		System.out.println("Precio anterior de la primera figura: " + f1.getPrecioFigura() + " €" + "\n");
		f1.subirPrecio(35);
		System.out.println("Precio despues de subir el precio un 10% de la primera figura: " + f1.getPrecioFigura() + " €");
		
		//3 (0,5 punto) Muestre un listado de todas las figuras de la colección con todas sus
		// características. Se valorará la claridad de la información mostrada.
		
		//System.out.println(SpiderMan.mostrarFiguras());
		
		//4 (0,5 puntos) Muestre un listado de aquellas figuras que tienen capa. Se valorará la claridad
		// de la información mostrada.
		
		System.out.println(SpiderMan.conCapa());

		//5 (0,5 puntos) Muestre las características de la figura más valiosa de la colección. Se valorará
		// la claridad de la información mostrada.
		 
		System.out.println(SpiderMan.masValioso());

		//6 (0,5 puntos) Muestre el valor total de la colección. Se valorará la claridad de la información
		// mostrada.
		
		System.out.println("\n" + "Valor total de la colección del ESPECTACULAR HOMBRE ARAÑA: " + SpiderMan.getValorColeccion() + " €");

		//7 (0,5 puntos) Muestre cuál es el volumen total de la colección. Se valorará la claridad de la
		// información mostrada.
		
		System.out.println("\n" + "Vólumen total de la colección del ESPECTACULAR HOMBRE ARAÑA: " + SpiderMan.getVolumenColeccion() + " Mm.");

		//8 (1 punto) Muestra cuántas figuras tienen capa y cuántas no, usando la información devuelta
		// por el método Coleccion.recuentoFigurasConSinCapa().
		
		System.out.println("\n" + SpiderMan.recuentoFigurasConSinCapa() + "\n");

		//9 (2 puntos) Muestra los divisores primos que tiene el número 100.
		
		Coleccion.divisoresPrimos(100);

		//10 (2 puntos) Muestra por consola un rectángulo de ancho 5 y alto 3.
		
		Coleccion.rectangulo(3, 12);
		
	}
}