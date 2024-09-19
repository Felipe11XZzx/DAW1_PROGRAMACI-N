package Evaluacion2;

public class Alumno {

	private String dniAlumno;
	private String nombreAlumno;
	private double [] notasFinales;
	
	public Alumno(String dni, String nombre) {
		this.dniAlumno = dni;
		this.nombreAlumno = nombre;
		this.notasFinales = new double [3];
	}
	
	public Alumno(String dni) {
		this(dni, "Sin Asignar");
	}

	public String getNombreAlumno() {
		return this.nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getDniAlumno() {
		return this.dniAlumno;
	}
	
	public void ingresarNotas(double puntosNota, int posicionNota) {
		this.notasFinales[posicionNota] = puntosNota;
	}
	
	@Override
	public String toString() {
		return "\n" + "!INFORMACIÓN ALUMNO IES ITACA¡" + "\n" +
					  "Nombre: " + this.nombreAlumno + "\n" +
					  "Dni: " + this.dniAlumno + "\n" + 
					  "Notas Finales Grado DAW: " + "\n" + "Primer Trimestre: " + this.notasFinales[0] + "\n" +
					  "Segundo Trimestre: " + this.notasFinales[1] + "\n" + "Tercer Trimestre: " + this.notasFinales[2] + "\n";
	}
}
