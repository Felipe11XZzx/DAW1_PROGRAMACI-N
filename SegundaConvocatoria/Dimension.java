package SegundaConvocatoria;

public class Dimension {

	private double alto;
	private double ancho;
	private double profundidad;
	
	public Dimension() {
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}
	
	public Dimension(double Palto, double Pancho, double Pprofundidad) {
		this.setAlto(Palto);
		this.setAncho(Pancho);
		this.setProfundidad(Pprofundidad);
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		if(alto > 10000000 || alto <= 0) {
			this.alto = 0;
			System.out.println("Medida del alto invalida en Mm.");
		}
		else {
			this.alto = alto;
		}
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho > 10000000 || ancho <= 0) {
			this.ancho = 0;
			System.out.println("Medida del ancho invalida en Mm.");
		}
		else {
			this.ancho = ancho;
		}
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		if(profundidad > 10000000 || profundidad <= 0) {
			this.profundidad = 0;
			System.out.println("Medida de la profundidad invalida en Mm.");
		}
		else {
			this.profundidad = profundidad;
		}
	}
	
	public double getVolumen() {
		return (this.getAlto() * this.getAncho() * this.getProfundidad());
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += "\n" + "!INFORMACIÓN DIMENSIÓN FIGURA SUPERHÉROE¡" + "\n" + 
				  "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
				  "Alto del superhéroe: " + this.alto + " Mm" + "\n" + 
				  "Ancho del superhéroe: " + this.ancho + " Mm" + "\n" + 
				  "Profundidad del superhéroe: "  + this.profundidad + " Mm" + "\n" + 
				  "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n";
		return cadena;

	}
}