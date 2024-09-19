package EmpresaTransporte;
import java.util.ArrayList;

public class GestorFlota {

	private ArrayList<VehiculoTransporte> flota;
	
	public GestorFlota() {
		this.flota = new ArrayList<>();
	}
	
	public void agregarVehiculo(VehiculoTransporte obj) {
		this.flota.add(obj);
	}
	
	public void eliminarVehiculo(int posicion) {
		this.flota.remove(posicion);
	}
	
	public void imprimirDetallesFlota() {
		for(VehiculoTransporte flotaG : flota) {
			System.out.println(flotaG.mostrarVehiculo());
		}
	}
	
	public double calcularConsumoTotalFlota(double consumo, double kilometros) {
		double consumoTotal = 0;
		for(VehiculoTransporte flotaG : flota) {
			consumoTotal += flotaG.calcularConsumoPromedio(consumo, kilometros);
		}
		return consumoTotal;
	}
	
	public void filtrarVehiculoPorTipoCarga(tipoCarga tipo) {
		ArrayList<tipoCarga> listaCarga = new ArrayList<>();
		for(tipoCarga flotaG : listaCarga) {
			listaCarga.add(flotaG);
			System.out.println(flotaG.toString());
		}
	}
	
	public void filtraVehiculoPorCapacidadPasajeros(int capacidad) {
		ArrayList<Furgoneta> listaFurgonetas = new ArrayList<>();
		for(Furgoneta furgonetas: listaFurgonetas) {
			listaFurgonetas.add(furgonetas);
			System.out.println(furgonetas.toString());
		}
	}
}
