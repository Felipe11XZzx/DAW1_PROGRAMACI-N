package Maquinaria;

public class Vagones {
	
	private int numeroIdentificador;
	private double cargaMaxima;
	private String tipoMercancia;
	
	Vagones(int identificador, double carga, String tipo){
		this.numeroIdentificador = identificador;
		this.cargaMaxima = carga;
		this.tipoMercancia = tipo;
	}

	public int getNumeroIdentificador() {
		return this.numeroIdentificador;
	}

	public void setNumeroIdentificador(int numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public double getCargaMaxima() {
		return this.cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public String getTipoMercancia() {
		return this.tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

	@Override
	public String toString() {
		return 		  "!INFORMACIÓN DEL VAGÓN¡" + "\n" + 
					  "Número Identificador: " + this.numeroIdentificador + "\n" +
					  "Carga Máxima: " + this.cargaMaxima + " Kg" + "\n" + 
					  "Tipo Mercancia: " + this.tipoMercancia + "\n";
	}
}
