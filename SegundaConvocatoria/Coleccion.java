package SegundaConvocatoria;
import java.util.*;

public class Coleccion {

	private String nombreColeccion;
	private ArrayList<Figura> coleccionSpiderMan;;
	
	public Coleccion(String nombre) {
		this.nombreColeccion = nombre;
		this.coleccionSpiderMan = new ArrayList<>();
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	public void agragarFigura(Figura obj) {
		this.coleccionSpiderMan.add(obj);
	}
	
	public void subirPrecio(double cantidad, String id) {
		for(Figura datos : coleccionSpiderMan) {
			if(datos.getCodigoFigura().equalsIgnoreCase(id)) {
			datos.subirPrecio(cantidad);
			}
		}
	}
	
	public String mostrarFiguras() {
		String infoFiguras = "";
		for(Figura mostrar : coleccionSpiderMan) {
			infoFiguras += "\n" + "\n" + "!NOMBRE DE LA COLECCIÓN¡" + "\n" + "\n" +
						   this.nombreColeccion + "\n" + "\n"
						   		+ "" + mostrar.toString();
		}
		return infoFiguras;
	}
	
	public String conCapa() {
		String conCapa = "";
		for(Figura tieneCapa : coleccionSpiderMan) {
			if(tieneCapa.getAtributoHeroe().isTieneCapa() == true) {
				conCapa += "\n" + "\n" + "!FIGURAS DE SUPERHÉROES CON CAPA¡" + "\n" +
							tieneCapa.toString() + "\n" + "\n";
			}
		}
		return conCapa;
	}
	
	public String masValioso() {
		String masCostoso = "";
		double costoso = 0;
		for(Figura costosa : coleccionSpiderMan) {
			if(costosa.getPrecioFigura() > costoso) {
				costoso = costosa.getPrecioFigura();
				masCostoso += "!FIGURA MÁS COSTOSA DE LA COLECCIÓN¡" + "\n" + 
				costosa.toString();
			}
		}
		return masCostoso;
	}
	
	public double getValorColeccion() {
		double valorTotal = 0;
		for(Figura valor : coleccionSpiderMan) {
			valorTotal += valor.getPrecioFigura();		
		}
		return valorTotal;
	}
	
	public double getVolumenColeccion() {
		double volumenTotal = 0;
		for(Figura valor : coleccionSpiderMan) {
			volumenTotal += valor.getAtributoDimension().getVolumen();		
		}
		return volumenTotal;
	}
	
	public String recuentoFigurasConSinCapa() {
		int tablaCapas [] = new int [2];
		int numeroCapas = 0;
		int numeroSinCapas = 0;
		for(Figura conteo : coleccionSpiderMan) {
			if(conteo.getAtributoHeroe().isTieneCapa() == true) {
				numeroCapas++;
				tablaCapas[0] = numeroCapas;
			}
			else {
				numeroSinCapas++;
				tablaCapas[1] = numeroSinCapas;
			}
		}
		return "!MOSTRANDO EL RECUENTO DE LAS FIGURAS CON Y SIN CAPA¡" + "\n" +
			   "!PRIMERA CASILLA FIGURAS CON CAPA¡, !SEGUNDA CASILLA FIGURAS SIN CAPA¡" + "\n" + "\n" + Arrays.toString(tablaCapas);
	}
	
	public static void rectangulo(int altura, int anchura) {
		System.out.println();
		for(int i = 0; i < altura; i++) {
			for(int k = 0; k < anchura; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	  public static int[] divisoresPrimos(int numero) {
	    	int [] t = new int [0];
	    	boolean esPrimo=false;
			
			for (int divisor=1 ; divisor<numero ; divisor++ ) {
				esPrimo=true;
				if (numero%divisor==0) {
					for (int i=2; i < divisor ; i++) {
						if (divisor%i==0) {
							esPrimo=false;
						}
					}
					if (esPrimo==true) {
						t = Arrays.copyOf(t, t.length+1);
						t[t.length-1] = divisor;

					}
				}
			}
			System.out.println("!TABLA CON LOS DIVISORES PRIMOS DEL NÚMERO¡" + " " + numero + "\n" + Arrays.toString(t));
	    	return t;
	    	
	    }
}