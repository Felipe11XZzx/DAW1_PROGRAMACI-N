package Maquinaria;
import Personal.Maquinistas;

public class Trenes {
	
	private Locomotoras locomotora;
	private Vagones atributoVagon [];
	private int numeroVagones;
	private Maquinistas maquinista;
	
	public Trenes(Locomotoras Plocomotora, Maquinistas Pmaquinista) {
		this.locomotora = Plocomotora;
		this.atributoVagon = new Vagones[5];
		this.numeroVagones = 0;
		this.maquinista = Pmaquinista;
	}
		
	public Locomotoras getLocomotora() {
		return this.locomotora;
	}

	public Maquinistas getMaquinista() {
		return this.maquinista;
	}

	public void agregarVagon(int identificador, double carga, String tipo) {
		if(numeroVagones >= 6) {
			System.out.println("\n" + "Máximo de vagones alcanzado." + "\n");
			}
			else {
				Vagones v1 = new Vagones(identificador, carga, tipo);
				atributoVagon[numeroVagones] = v1;
				numeroVagones++;
			}
		}
	
	public String vagon() {
		return atributoVagon.toString();
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += "!INFORMACIÓN AVE RENFE¡" + "\n";
		cadena += "\n" + "Locomotora: " + this.locomotora + "\n";
		cadena += "\n" + "Maquinista: " + this.maquinista + "\n";
		cadena += "\n" + "Número Vagones: " + this.numeroVagones + "\n";
		for(int i = 0; i < this.numeroVagones; i++) {
				cadena += "\n" + this.atributoVagon[i] + "\n";
			};
			return cadena;
		}
	}