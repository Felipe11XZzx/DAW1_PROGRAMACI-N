package PrimeraConvocatoriaExamen2;

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;

	public Hora() {
		this.hora = 11;
		this.minutos = 35;
		this.segundos = 47;
	}
	
	public void incrementarSegundos() {
		this.segundos++;
		if(this.segundos == 60) {
			this.minutos++;
			this.segundos = 0;
			if(this.minutos == 60) {
				this.hora++;
				this.minutos = 0;
				if(this.hora == 24) {
					this.hora = 0;
				}
			}
		}
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(this.hora > 24 || this.hora < 0) {
			this.hora = 0;
		}
		else this.hora = hora;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		if(this.minutos > 61 || this.minutos < 0) {
			this.minutos = 0;
		}
		else this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if(this.segundos > 60 || this.segundos < 0) {
			this.segundos = 0;
		}
		else this.segundos = segundos;
	}
}