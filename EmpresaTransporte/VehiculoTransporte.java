package EmpresaTransporte;

public abstract class VehiculoTransporte {
	
	protected marcaCoches marcaCoche;
	protected String modeloCoche;
	protected int añoFabricacion;
	protected double velocidadMaxima;
	protected double capacidadCarga;
	protected abstract double calcularConsumoPromedio(double kilometros, double combustible);
	protected abstract String mostrarVehiculo();
	
	public VehiculoTransporte(marcaCoches Pmarca, String Pmodelo, int Pfabricacion, double Pvelocidad, double Pcarga) {
		this.marcaCoche = Pmarca;
		this.modeloCoche = Pmodelo;
		this.setAñoFabricacion(Pfabricacion);
		this.setVelocidadMaxima(Pvelocidad);
		this.setCarga(Pcarga);
	}
	
	public void setAñoFabricacion(int fecha) {
		if(fecha < 0 || fecha > 2025){
			this.añoFabricacion = fecha;
		}
		else {
			this.añoFabricacion = 0;
		}
	}
	
	public void setVelocidadMaxima(double velocidad) {
		if(velocidad >= 0 || velocidad <= 190) {
			this.velocidadMaxima = velocidad;
		}
		else {
			this.velocidadMaxima = 0;
		}
	}
	
	public void setCarga(double carga) {
		if(carga >= 0 || carga < 9000) {
			this.capacidadCarga = carga;
		}
		else {
			this.capacidadCarga = 0;
		}
	}
}