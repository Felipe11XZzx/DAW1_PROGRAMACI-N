package EvaluacionTrimestre2;

public class Tortilla {
	
	private String tortilla_de;
	private boolean con_cebolla;
	private boolean tamano_grande;
	private int pinchos;
	
	public Tortilla(boolean grande, boolean cebolla) {
		this.setTortilla_de("Patata");
		this.tamano_grande = grande;
		this.setCon_cebolla(cebolla);
		if(this.tamano_grande) {
			this.pinchos = 10;
		}
		else {
			this.pinchos = 6;
		}
	}
	
	public Tortilla(String tipoTortilla, boolean grande) {
		this.setTortilla_de(tipoTortilla);
		this.tamano_grande = grande;
		this.setCon_cebolla(false);
		if(this.tamano_grande) {
			this.pinchos = 10;
		}
		else {
			this.pinchos = 6;
		}
	}
	
	public int servirPincho(int numeroPinchos) {
		if(numeroPinchos > 0 || numeroPinchos <= 10) {
			this.pinchos -= numeroPinchos;
		}
		else {
			System.out.println("Se acabaron los pinchos la cocina tiene mucho jaleo.");
			this.pinchos = 0;
		}
		return this.pinchos;
	}

	public void reponerTortilla() {
		if(this.tamano_grande) {
			this.pinchos = 10;
		}
		else {
			this.pinchos = 6;
		}
	}
	
	public int pinchosDisponibles() {
		return this.pinchos;
	}

	public boolean isCon_cebolla() {
		return this.con_cebolla;
	}

	public void setCon_cebolla(boolean con_cebolla) {
		this.con_cebolla = con_cebolla;
	}

	public String getTortilla_de() {
		return this.tortilla_de;
	}

	public void setTortilla_de(String tortilla_de) {
		this.tortilla_de = tortilla_de;
	}

	@Override
	public String toString() {
		return "Tortilla [tortilla_de = " + tortilla_de + ", con_cebolla = " + con_cebolla + ", tamano_grande = "
				+ tamano_grande + ", pinchos = " + pinchos + "]";
	}
	
	
}