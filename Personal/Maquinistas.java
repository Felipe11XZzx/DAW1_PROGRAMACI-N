package Personal;

public class Maquinistas {

	private String dniMaquinista;
	private double sueldoMaquinista;
	private String rangoMaquinista;
	
	public Maquinistas(String dni, double sueldo, String rango) {
		this.setDniMaquinista(dni);
		this.setSueldoMaquinista(sueldo);
		this.setRangoMaquinista(rango);
	}

	public double getSueldoMaquinista() {
		return sueldoMaquinista;
	}

	public void setSueldoMaquinista(double sueldoMaquinista) {
		this.sueldoMaquinista = sueldoMaquinista;
	}

	public String getDniMaquinista() {
		return dniMaquinista;
	}

	public void setDniMaquinista(String dniMaquinista) {
		this.dniMaquinista = dniMaquinista;
	}

	public String getRangoMaquinista() {
		return rangoMaquinista;
	}

	public void setRangoMaquinista(String rangoMaquinista) {
		this.rangoMaquinista = rangoMaquinista;
	}
	
	@Override
	public String toString() {
		return 		 "\n" + "!INFORMACIÓN MAQUINISTA¡" + "\n" + 
					  "Identificación: " + this.dniMaquinista + "\n" +
					  "Sueldo Cargo: " + this.sueldoMaquinista + "\n" + 
					  "Rango Maquinista: " + this.rangoMaquinista;
	}
}
