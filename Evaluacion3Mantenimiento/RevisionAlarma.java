package Evaluacion3Mantenimiento;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

	protected int numeroAlarmas;

	public RevisionAlarma(LocalDate fecha, String empresa, int alarmas) {
		super("Revisor Especialista Contraincendios", fecha, empresa);
		this.numeroAlarmas = alarmas;
	}

	public int getNumeroAlarmas() {
		return this.numeroAlarmas;
	}

	public void setNumeroAlarmas(int numeroAlarmas) {
		this.numeroAlarmas = numeroAlarmas;
	}

	@Override
	public double costeMaterial() {
		return 0;
	}

	@Override
	public double costeManoObra() {
		double costeMano = 0;
		return costeMano = (costeMano + (this.numeroAlarmas / 3) *40);
	}

	@Override
	public double costeTotal() {
		return costeManoObra();
	}

	@Override
	public String detalleServicio() {
		return "REVISIÓN PERIÓDICA DE ALARMAS CONTRAINCENDIOS" + "\n" +
				"Cliente: " + this.nombreEmpresa + "\n" + 
				"Fecha revisión: " + this.fechaInicio + "\n" + 
				"- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" + 
				"TOTAL: ...................." + this.costeTotal() + "\n" +
				"- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n";
		}
}