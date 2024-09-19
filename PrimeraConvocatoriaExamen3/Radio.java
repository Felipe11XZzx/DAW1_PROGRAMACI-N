package PrimeraConvocatoriaExamen3;

public class Radio implements EsEco, IControlador {

	private double frecuencia;
	private char etiquetaEnergetica;
	
	public Radio() {
		this.frecuencia = 80;
		this.etiquetaEnergetica = 'B';
	}
	
	public Radio(double Pfrecuencia, char PetiquetaElectrica) {
		this.frecuencia = Pfrecuencia;
		this.etiquetaEnergetica = PetiquetaElectrica;
		if(this.frecuencia > 108) {
			this.frecuencia = 80;
		}
		else if(this.frecuencia < 80) {
			this.frecuencia = 108;
		}
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
	public void SubirFrencuencia() {
		this.frecuencia = frecuencia + 0.5;
		if(this.frecuencia > 108) {
			this.frecuencia = 80;
		}
	}

	@Override
	public void BajarFrecuencia() {
		this.frecuencia = frecuencia - 0.5;
		if(this.frecuencia < 80) {
			this.frecuencia = 108;
		}
	}
	
	public char getEtiquetaElectrica() {
		return this.etiquetaEnergetica;
	}

	@Override
	public String toString() {
		return "Radio [frecuencia = " + frecuencia + ", etiquetaEnergetica = " + etiquetaEnergetica + "]";
	}
}