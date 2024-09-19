package Evaluacion3Mantenimiento;
import java.time.LocalDate;

public abstract class Servicio {

	protected String nombreTrabajador;
	protected LocalDate fechaInicio;
	protected String nombreEmpresa;
	
	public Servicio(String nombre, LocalDate fecha, String empresa) {
		this.nombreTrabajador = nombre;
		this.fechaInicio = fecha;
		this.nombreEmpresa = empresa;
	}

	public String getNombreTrabajador() {
		return this.nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public abstract double costeMaterial();
	public abstract double costeManoObra();
	public abstract double costeTotal();
	public abstract String detalleServicio();

}