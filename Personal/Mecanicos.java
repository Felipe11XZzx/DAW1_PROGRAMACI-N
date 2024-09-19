package Personal;

public class Mecanicos {
	
	private String nombreMecanico;
	private String movilMecanico;
	private especialidadMecanico especialidad;
	
	public Mecanicos(especialidadMecanico esp, String nombre, String numeroMovil) {
		this.nombreMecanico = nombre;
		this.movilMecanico = numeroMovil;
		this.especialidad = esp;
	}

	public String getNombreMecanico() {
		return this.nombreMecanico;
	}

	public void setNombreMecanico(String nombreMecanico) {
		this.nombreMecanico = nombreMecanico;
	}

	public String getMovilMecanico() {
		return this.movilMecanico;
	}

	public void setMovilMecanico(String movilMecanico) {
		this.movilMecanico = movilMecanico;
	}

	public especialidadMecanico getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(especialidadMecanico especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return 		  "\n" + "!INFORMACIÓN DEL MECANICO¡" + "\n" + 
					  "Nombre: " + this.nombreMecanico + "\n" +
					  "Número Móvil: " + this.movilMecanico + "\n" + 
					  "Área Especialización: " + this.especialidad;
	}
}