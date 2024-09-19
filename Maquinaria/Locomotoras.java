package Maquinaria;
import Personal.Mecanicos;

public class Locomotoras {

	private String matriculaLocomotora;
	private double potenciaMotores;
	private Mecanicos mecanico;
	
	public Locomotoras(String matricula, double potencia, Mecanicos Pmecanico) {
		this.matriculaLocomotora = matricula;
		this.potenciaMotores = potencia;
		this.mecanico = Pmecanico;
	}

	public String getMatriculaLocomotora() {
		return this.matriculaLocomotora;
	}

	public void setMatriculaLocomotora(String matriculaLocomotora) {
		this.matriculaLocomotora = matriculaLocomotora;
	}

	public double getPotenciaMotores() {
		return this.potenciaMotores;
	}

	public void setPotenciaMotores(double potenciaMotores) {
		this.potenciaMotores = potenciaMotores;
	}

	public Mecanicos getMecanico() {
		return this.mecanico;
	}
	
	@Override
	public String toString() {
		return "\n" + "!INFORMACIÓN DE LA LOCOMOTORA¡" + "\n" + 
					  "Matricula: " + this.matriculaLocomotora + "\n" +
					  "Potencia Motores: " + this.potenciaMotores + "\n" + 
					  "Informacion Mecanico: " + this.mecanico + "\n";
	}
}