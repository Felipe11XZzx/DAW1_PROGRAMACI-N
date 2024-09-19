package EmpresaTransporte;

public class Furgoneta extends VehiculoTransporte {

	private int capacidadPasajeros;
	
	public Furgoneta(marcaCoches Pmarca, String Pmodelo, int Pfabricacion, double Pvelocidad, double Pcarga, int pasajeros) {
		super(Pmarca, Pmodelo, Pfabricacion, Pvelocidad, Pcarga);
		this.setPasajeros(pasajeros);
		this.setAñoFabricacion(Pfabricacion);
	}
	
	public void setAñoFabricacion(int fecha) {
		if(fecha > 999 || fecha <= 2025){
			this.añoFabricacion = fecha;
		}
		else {
			this.añoFabricacion = 0;
		}
	}
	
	public void setPasajeros(int cantidadPasajeros) {
		if(cantidadPasajeros >= 0 || cantidadPasajeros <= 12) {
			this.capacidadPasajeros = cantidadPasajeros;
		}
		else {
			this.capacidadPasajeros = 0;
		}
	}

	@Override
	protected double calcularConsumoPromedio(double kilometros, double combustible) {
		return (kilometros / combustible);
	}
	
	@Override
	protected String mostrarVehiculo() {
		return "\n" + "INFORMACIÓN DEL VEHICULO TIPO: FURGONETA" + "\n" + 
					  "- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
					  "Marca: " + this.marcaCoche + "\n" + 
					  "Modelo: " + this.modeloCoche + "\n" + 
					  "Año Fabricación: " + this.añoFabricacion + "\n" + 
					  "Velocidad Máxima: " + this.velocidadMaxima + " Km/h" + "\n" +
					  "Capacidad Máxima Pasajeros: " + this.capacidadPasajeros + "\n";
	}
}