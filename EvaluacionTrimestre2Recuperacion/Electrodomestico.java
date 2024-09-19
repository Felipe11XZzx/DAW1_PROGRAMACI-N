package EvaluacionTrimestre2Recuperacion;

public class Electrodomestico {

	private tipoElectrodomestico tipo;
	private String marca;
	private String modelo;
	private double potencia;
	
	public Electrodomestico(tipoElectrodomestico type, String mark, String model, double potency) {
		this.tipo = type;
		this.marca = mark;
		this.modelo = model;
		this.potencia = potency;
	}

	public String getModelo() {
		return this.modelo ;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return this.potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public tipoElectrodomestico getTipo() {
		return this.tipo;
	}

	public String getMarca() {
		return this.marca;
	}

	public String mostrarElectrodomestico() {
		return "Electrodomestico [tipo = " + tipo + ", marca = " + marca + ", modelo = " + modelo + ", potencia = " + potencia
				+ "]";
	}
	
	public double getConsumo(int horas) {
		double calculoConsumo = (this.potencia * horas / 1000);
		return calculoConsumo;
	}
	
	public double getCosteConsumo(int horas, double costeHora) {
		return (getConsumo(horas) * costeHora);
	}
}
