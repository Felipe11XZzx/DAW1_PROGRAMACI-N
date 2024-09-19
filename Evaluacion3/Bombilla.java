package Evaluacion3;

public class Bombilla {
	
	private boolean interruptor;
	public static boolean cuadroElectrico;
	
	public Bombilla() {
		this.interruptor = false;
	}
	
	public void encenderBombilla() {
		this.interruptor = true;
	}
	
	public void apagarBombilla() {
		this.interruptor = false;
	}
	
	public boolean encendida() {
		return this.interruptor;
	}
		
	public boolean estadoCuadroElectrico() {
		return (this.interruptor && Bombilla.cuadroElectrico);
	}

	public String estadoBombilla() {
		String cadena = "";
		if(estadoCuadroElectrico() == true) {
			return cadena += "Las Bombillas estan encendidas.";
		}
		else {
			return cadena += "Las Bombillas estan apagadas.";
		}
	}
}
