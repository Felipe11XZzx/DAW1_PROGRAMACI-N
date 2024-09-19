package ClasePersona;

public class Persona {

	private String nombrePersona;
	private String dniPersona;
	private int edadPersona;
	
	public Persona(String doc, String name, int age) {
		this.dniPersona = doc;
		this.nombrePersona = name;
		this.edadPersona = age;
	}

	public String getNombrePersona() {
		return this.nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getDniPersona() {
		return this.dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public int getEdadPersona() {
		return this.edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}
	
	public String mostrarPersona() {
		return "\n" + "INFORMACIÓN DE LA PERSONA" + "\n" + 
					  "Nombre: " + this.nombrePersona + "\n" + 
					  "Edad: " + this.edadPersona + "\n" +
					  "Documentación: " + this.dniPersona + "\n";
	}
}