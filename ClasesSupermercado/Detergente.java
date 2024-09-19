package ClasesSupermercado;
import InterfacesSupermercado.IConDescuento;
import InterfacesSupermercado.IEsLiquido;

public class Detergente implements IEsLiquido, IConDescuento {

	private String marca;
	private double precio;
	private double porcentajeDescuento;
	private String tipoEnvase;
	private double cantidadVolumen;
	
	public Detergente(String mark, double price) {
		this.marca = mark;
		this.setPrecio(price);
	}

	public String getMarca() {
		return this.marca ;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0 || precio <= 60) {
			this.precio = precio;
		}
		else this.precio = 0;	
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
	public void setVolumen(double v) {
		this.cantidadVolumen = v;
	}

	@Override
	public double getVolumen() {
		return this.cantidadVolumen;
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
	public String toString() {
		return "DETERGENTE DEL SUPERMECADO" + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Marca: " + this.marca + "\n" + 
			   "Tipo Envase: " + this.tipoEnvase + "\n" +
			   "Volumen: " + this.cantidadVolumen + "Ml" + "\n" +
			   "Porcentaje Descuento: " + this.porcentajeDescuento + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - - " + "\n" +
			   "Precio: " + this.precio + "€" + "\n";
	}
}