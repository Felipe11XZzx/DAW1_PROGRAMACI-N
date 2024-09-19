package ClaseHora;

public class Hora {

	protected int hora;
	protected int minutos;
	
	public Hora(int hour, int minutes) {
		this.setHora(hour);
		this.setMinutos(minutes);
	}
	
	public void inc() {
		this.minutos++;
		if(this.minutos == 60) {
			this.hora++;
			this.minutos = 0;
			if(this.hora == 24) {
				this.hora = 0;
			}
		}
	}
	
	public boolean setHora(int hour) {
		boolean horaValida = true;
		if(hour < 0 || hour > 24) {
			this.hora = 0;
			horaValida = false;
		}
		else {
			this.hora = hour;
		}
		return horaValida;
	}
	
	public boolean setMinutos(int minutes) {
		boolean minutosValidos = true;
		if(minutes < 0 || minutes > 60) {
			this.minutos = 0;
			minutosValidos = false;
		}
		else {
			this.minutos = minutes;
		}
		return minutosValidos;
	}
	
	public int getHora() {
		return this.hora;
	}

	public int getMinutos() {
		return this.minutos;
	}

	@Override
	public String toString() {
		return 		  "!MOSTRANDO LA HORA DEL RELOJ¡" + "\n" +
					  "Horas: " + this.hora + " " + "Minutos: " + this.minutos + " ";
	}
}