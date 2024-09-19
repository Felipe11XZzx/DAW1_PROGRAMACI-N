package ClaseHoraExacta;
import ClaseHora.Hora;

public class HoraExacta extends Hora {

	protected int segundos;
	
	public HoraExacta(int hour, int minutes, int seconds) {
		super(hour, minutes);
		this.setSegundos(seconds);
	}
	
	public boolean setSegundos(int seconds) {
		boolean segundosValidos = true;
		if(seconds < 0 || seconds > 60) {
			segundosValidos = false;
			this.segundos = 0;
		}
		else {
			this.segundos = seconds;
		}
		return segundosValidos;
	}
	
	@Override
	public void inc() {
		this.segundos++;
		if(this.segundos == 60) {
			this.segundos = 0;
			this.minutos++;
			if(this.minutos == 60) {
				this.hora++;
				this.minutos = 0;
				if(this.hora == 24) {
					this.hora = 0;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += super.toString() + "Segundos: " + this.segundos;
		return cadena;
	}
}
