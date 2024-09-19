package Personal;
import java.time.LocalDate;

public class JefeEstacion {

	private String nombreJefe;
	private LocalDate fechaCargo;
	
	public JefeEstacion(String nombre, LocalDate fecha) {
		this.nombreJefe = nombre;
		this.fechaCargo = fecha;
	}

	public String getNombreJefe() {
		return this.nombreJefe;
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

	public LocalDate getFechaCargo() {
		return this.fechaCargo;
	}

	public void setFechaCargo(LocalDate fechaCargo) {
		this.fechaCargo = fechaCargo;
	}
	
	
}
