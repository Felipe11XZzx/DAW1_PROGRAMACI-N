package SegundaConvocatoria;

public class Figura {

	private String codigoFigura;
	private double precioFigura;
	private Superheroe atributoHeroe;
	private Dimension atributoDimension;
	
	public Figura(String codigo, double precio, Dimension Pdimension, Superheroe Pheroe) {
		this.codigoFigura = codigo;
		this.setPrecioFigura(precio);
		this.atributoDimension = Pdimension;
		this.atributoHeroe = Pheroe;
	}

	public String getCodigoFigura() {
		return codigoFigura;
	}

	public void setCodigoFigura(String codigoFigura) {
		this.codigoFigura = codigoFigura;
	}

	public double getPrecioFigura() {
		return precioFigura;
	}

	public double setPrecioFigura(double precioFigura) {
		if(precioFigura < 0 || precioFigura > 100000000) {
			this.precioFigura = 0;
		}
		else {
			this.precioFigura = precioFigura;
		}
		return this.precioFigura;
	}

	public Superheroe getAtributoHeroe() {
		return atributoHeroe;
	}

	public void setAtributoHeroe(Superheroe atributoHeroe) {
		this.atributoHeroe = atributoHeroe;
	}

	public Dimension getAtributoDimension() {
		return atributoDimension;
	}

	public void setAtributoDimension(Dimension atributoDimension) {
		this.atributoDimension = atributoDimension;
	}
	
	public void subirPrecio(double cantidad) {
		this.precioFigura += cantidad;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += "\n" + "!INFORMACIÓN COMPLETA DE LA FIGURA SUPERHÉROE¡" + "\n" + 
				  "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
				  "Código Figura: " + this.codigoFigura + "\n" + "\n" +
				  "A CONTINUACIÓN LAS DIMENSIONES DE ESTA: "  + "\n" +
				  this.atributoDimension.toString() + "\n" +
				  "A CONTINUACIÓN INFORMACIÓN DEL SUPERHEROE: "  + "\n" +
				  this.atributoHeroe.toString() + "\n" +
				   "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" + 
				  "Precio Figura: " + this.precioFigura + " €" + "\n" +
				   "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n";
		return cadena;

	}
}