package PrimeraConvocatoriaExamen3;

public class Cafetera implements EsEco, Comparable<Object> {

	private int capacidadMaxima;
	private int cantidadActual;
	private char etiquetaEnergetica;
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
		this.etiquetaEnergetica = 'B';
	}
	
	public Cafetera(int PcantidadMaxima, char PetiquetaElectrica) {
		this.capacidadMaxima = PcantidadMaxima;
		this.cantidadActual = PcantidadMaxima;
		this.etiquetaEnergetica = PetiquetaElectrica;
	}
	
	public Cafetera(int PcapacidadMaxima, int PcantidadActual, char PetiquetaElectrica) {
		this.capacidadMaxima = PcapacidadMaxima;
		this.cantidadActual = PcantidadActual;
		if(this.cantidadActual > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}
		this.etiquetaEnergetica = PetiquetaElectrica;
	}
	
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public int servirTaza(int cantidadCafe) {
		int cafeDisponible = this.cantidadActual - this.capacidadMaxima;
		if(cafeDisponible <= cantidadCafe) {
			cafeDisponible -= cantidadCafe;
		}
		return cafeDisponible;
	}
	
	public int agregarCafe(int cantidadCafe) {
		if(this.cantidadActual < this.capacidadMaxima) {
			this.cantidadActual += cantidadCafe;
		}
		return this.cantidadActual;
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	@Override
	public double getNoAhorro() {
		double importeGastoEtiquetaEnergetica = 0;
		
		switch(this.etiquetaEnergetica) {
		
		case 'A' :
			importeGastoEtiquetaEnergetica = 0;
			break;
			
		case 'B' :
			importeGastoEtiquetaEnergetica = 28.36;
			break;
			
		case 'C' :
			importeGastoEtiquetaEnergetica = 35.35;
			break;
			
		case 'D' :
			importeGastoEtiquetaEnergetica = 45.17;
			break;
			
		case 'E' :
			importeGastoEtiquetaEnergetica = 65.46;
			break;
			
		case 'F' :
			importeGastoEtiquetaEnergetica = 88.15;
			break;
			
		case 'G' :
			importeGastoEtiquetaEnergetica = 100.02;
			break;
			
		default :
			importeGastoEtiquetaEnergetica = 0;
		}
		return importeGastoEtiquetaEnergetica;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean iguales = true;
		Cafetera Obj2 = new Cafetera();
		Obj2 = (Cafetera)(o);
		
		if(this.capacidadMaxima != Obj2.capacidadMaxima) {
			iguales = false;
		}
		return iguales;
	}

	@Override
	public int compareTo(Object o) {
		Cafetera Obj2 = new Cafetera();
		Obj2 = (Cafetera)(o);
		return this.capacidadMaxima - Obj2.capacidadMaxima;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima = " + capacidadMaxima + ", cantidadActual = " + cantidadActual
				+ ", etiquetaEnergetica = " + etiquetaEnergetica + "]";
	}
}