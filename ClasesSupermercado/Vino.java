package ClasesSupermercado;
import java.time.LocalDate;

import InterfacesSupermercado.*;

public class Vino implements IConDescuento, IEsLiquido, IEsAlimento {

	// ATRIBUTOS CLASE.
	
	private String marca;
	private String tipoVino;
	private int gradosAlcohol;
	private double precio;
	
	// ATRIBUTOS INTERFACES.
	
	private LocalDate fechaCaducidad;
	private int cantidadCalorias;
	private double porcentajeDescuento;
	private String tipoEnvase;
	private double volumenEnvase;
	
	public Vino(String Pmarca, String PtipoVino, int PgradosAlcohol, double Pprecio) {
		this.marca = Pmarca;
		this.tipoVino = PtipoVino;
		this.gradosAlcohol = PgradosAlcohol;
		this.setPrecio(Pprecio);
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoVino() {
		return this.tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public int getGradosAlcohol() {
		return this.gradosAlcohol;
	}

	public void setGradosAlcohol(int gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0 || precio < 100000) {
			this.precio = precio;
		}
		else {
			this.precio = 0;
		}
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.fechaCaducidad = fc;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.fechaCaducidad;
	}

	@Override
	public int getCalorias() {
		return this.cantidadCalorias = (this.gradosAlcohol) * 10;
	}

	@Override
	public void setVolumen(double v) {
		if(v > 0 || v < 5000) {
			this.volumenEnvase = v;
		}
		else {
			this.volumenEnvase = 0;
		}
	}

	@Override
	public double getVolumen() {
		return this.volumenEnvase;
	}

	@Override
	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;
	}

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}

	@Override
	public void setDescuento(double des) {
		this.porcentajeDescuento = des;
	}

	@Override
	public double getDescuento() {
		return this.porcentajeDescuento;
	}

	@Override
	public double getPrecioDescuento() {
		return (this.precio * this.getPrecioDescuento());
	}
	
	@Override
	public String toString() {
		return "VINO DEL SUPERMECADO" + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Marca: " + this.marca + "\n" + 
			   "Tipo Vino: " + this.tipoVino + "\n" +
			   "Tipo Envase: " + this.tipoEnvase + "\n" +
			   "Cantidad Calorías: " + this.cantidadCalorias + "\n" +
			   "Fecha Caducidad: " + this.fechaCaducidad + "\n" +
			   "Volumen Botella: " + this.volumenEnvase + " Ml" + "\n" +
			   "Porcentaje Descuento: " + this.porcentajeDescuento + "\n" +
			   "Grados Alcohol: " + this.gradosAlcohol + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Precio: " + this.precio + "€" + "\n";
	}
}