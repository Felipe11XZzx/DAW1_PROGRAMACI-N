package ClasesSupermercado;
import java.time.LocalDate;

import InterfacesSupermercado.IEsAlimento;

public class Cereales implements IEsAlimento {

	private String marca;
	private String tipoCereal;
	private double precio;
	private LocalDate fechaCaducidad;
	private int cantidadCalorias;
	
	public Cereales(String marcaCereal, String tipoCereal, double precio) {
		this.marca = marcaCereal;
		this.setTipoCereal(tipoCereal);
		this.setPrecio(precio);
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoCereal() {
		return this.tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
		if(this.tipoCereal.equalsIgnoreCase("espelta")) {
			this.cantidadCalorias = 5;
		}
		else if(this.tipoCereal.equalsIgnoreCase("maiz")) {
			this.cantidadCalorias = 8;
		}
		else if(this.tipoCereal.equalsIgnoreCase("trigo")) {
			this.cantidadCalorias = 12;
		}
		else this.cantidadCalorias = 15;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		if(this.precio > 0 || this.precio < 100) {
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
		return this.cantidadCalorias;
	}
	
	@Override
	public String toString() {
		return "CEREAL DEL SUPERMECADO" + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Marca: " + this.marca + "\n" + 
			   "Tipo Cereal: " + this.tipoCereal + "\n" +
			   "Cantidad Calorías: " + this.cantidadCalorias + "\n" +
			   "Fecha Caducidad: " + this.fechaCaducidad + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Precio: " + this.precio + "€" + "\n";
	}
}