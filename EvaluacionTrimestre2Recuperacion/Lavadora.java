package EvaluacionTrimestre2Recuperacion;

public class Lavadora extends Electrodomestico {
	
	private double precio;
	private boolean aguaCaliente;
	
	public Lavadora (String mark, double potency) {
		super(tipoElectrodomestico.LAVADORA, mark, "Modelo Sin Asignar", potency);
		this.aguaCaliente = false;
	}

	public Lavadora (String mark, double price, double potency, boolean funcionamiento) {
		super(tipoElectrodomestico.LAVADORA, mark, "Modelo Sin Asignar", 880);
		this.precio = price;
		this.aguaCaliente = funcionamiento;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return this.aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	public String mostrarLavadora() {
		return mostrarElectrodomestico() + "Lavadora [ precio =" + precio + ", aguaCaliente = " + aguaCaliente + "]";
	}
	
	public double getConsumo(int horas) {
		double costeConsumo = 0;
		if(!this.aguaCaliente) {
			costeConsumo = super.getConsumo(horas);
		}
		else { 
			costeConsumo = (horas * (this.getPotencia() / 1000 + (this.getPotencia() / 1000) * 0.20));
			}
		return costeConsumo;
	}
	
	public double getCosteConsumo(int horas, int costeHora) {
		return getCosteConsumo(horas, costeHora);
	}
}