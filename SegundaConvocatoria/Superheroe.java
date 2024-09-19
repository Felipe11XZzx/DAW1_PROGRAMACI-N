package SegundaConvocatoria;

public class Superheroe {
	
	private String nombreHeroe;
	private String descripcionHeroe;
	private boolean tieneCapa;
	
	public Superheroe(String nombre) {
		this.nombreHeroe = nombre;
		this.descripcionHeroe = "";
		this.tieneCapa = false;
	}

	public String getNombreHeroe() {
		return nombreHeroe;
	}

	public void setNombreHeroe(String nombreHeroe) {
		this.nombreHeroe = nombreHeroe;
	}

	public String getDescripcionHeroe() {
		return descripcionHeroe;
	}

	public void setDescripcionHeroe(String descripcionHeroe) {
		this.descripcionHeroe = descripcionHeroe;
	}

	public boolean isTieneCapa() {
		return tieneCapa;
	}

	public void setTieneCapa(boolean tieneCapa) {
		this.tieneCapa = tieneCapa;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "\n" + "!INFORMACIÓN DEL SUPERHÉROE¡" + "\n" + 
				  "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
				  "Nombre del superhéroe: " + this.nombreHeroe + "\n" + 
				  "Descripción del superhéroe: " + this.descripcionHeroe + "\n" + 
				  "Tiene capa? :"  + this.tieneCapa + "\n" + 
				  "- - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n";
		return cadena;

	}
}