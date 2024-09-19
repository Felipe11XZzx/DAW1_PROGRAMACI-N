package EmpresaTransporte;

public class Camion extends VehiculoTransporte {

	private tipoCarga carga;
	
	public Camion(marcaCoches Pmarca, String Pmodelo, int Pfabricacion, double Pvelocidad, double Pcarga, tipoCarga Tcarga) {
		super(Pmarca, Pmodelo, Pfabricacion, Pvelocidad, Pcarga);
		this.setCarga(Tcarga);
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

	@Override
	protected double calcularConsumoPromedio(double Pkilommetros, double Pcombustible) {
		return (Pkilommetros / Pcombustible);
	}

	public tipoCarga getCarga() {
		return this.carga;
	}

	public void setCarga(tipoCarga carga) {
		this.carga = carga;
	}

	@Override
	protected String mostrarVehiculo() {
		return "\n" + "INFORMACIÓN DEL VEHICULO TIPO: CAMIÓN" + "\n" + 
					  "- - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n" +
					  "Marca: " + this.marcaCoche + "\n" + 
					  "Modelo: " + this.modeloCoche + "\n" + 
					  "Año Fabricación: " + this.añoFabricacion + "\n" + 
					  "Velocidad Máxima: " + this.velocidadMaxima + " Km/h" + "\n" +
					  "Tipo Carga: " + this.carga + "\n";
	}
}