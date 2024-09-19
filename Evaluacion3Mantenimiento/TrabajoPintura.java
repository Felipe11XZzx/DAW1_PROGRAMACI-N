package Evaluacion3Mantenimiento;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

	protected double superficieAPintar;
	protected double precioPintura;
	
	public TrabajoPintura(String nombre, LocalDate fecha, String empresa, double superficie, double costePintura) {
		super(nombre, fecha, empresa);
		this.superficieAPintar = superficie;
		this.precioPintura = costePintura;
	}

	public double getSuperficieAPintar() {
		return this.superficieAPintar;
	}

	public void setSuperficieAPintar(double superficieAPintar) {
		this.superficieAPintar = superficieAPintar;
	}

	public double getPrecioPintura() {
		return this.precioPintura;
	}

	public void setPrecioPintura(double precioPintura) {
		this.precioPintura = precioPintura;
	}

	@Override
	public double costeMaterial() {
		return ((this.superficieAPintar / 7.8) * this.precioPintura);
	}

	@Override
	public double costeManoObra() {
		return ((this.superficieAPintar / 10) * 9.5);
	}

	@Override
	public double costeTotal() {
		double coste = 0;
		return coste = coste + costeMaterial() + costeManoObra();
	}
	
	public double costeAdicional() {
		if(this.superficieAPintar < 50) {
			return costeTotal() * 0.15;
		}
		return 0;
	}

	@Override
	public String detalleServicio() {
		return "TRABAJO DE PINTURA" + "\n" +
			   "Cliente: " + this.nombreEmpresa + "\n" + 
			   "Fecha de incio: " + this.fechaInicio + "\n" + 
			   "- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
			   "Pintor: " + this.nombreTrabajador + "\n" + 
			   "Coste Material........." + this.costeMaterial() + "\n" + 
			   "Coste Mano Obra.........." + this.costeManoObra() + "\n" + 
			   "Coste Adicional.........." + this.costeAdicional() + "\n" + 
			   "TOTAL: ...................." + this.costeTotal() + "\n" +
			   "- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n";
	}
}