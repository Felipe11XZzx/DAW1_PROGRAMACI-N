package EmpresaTransporte;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Furgoneta furgo1 = new Furgoneta(marcaCoches.FORD, "Cargo", 2011, 180, 5500, 7);
		Camion cami1 = new Camion(marcaCoches.FOTON, "Deluxe", 2021, 140, 8800, tipoCarga.CARGA_ANCHA);
		
		furgo1.calcularConsumoPromedio(50, 1);
		cami1.calcularConsumoPromedio(80, 1.15);

		GestorFlota listaFlota = new GestorFlota();
		
		listaFlota.agregarVehiculo(cami1);
		listaFlota.agregarVehiculo(furgo1);
		
		listaFlota.imprimirDetallesFlota();
		listaFlota.filtrarVehiculoPorTipoCarga(tipoCarga.CARGA_ANCHA);
		listaFlota.filtraVehiculoPorCapacidadPasajeros(7);
		
		double costeConsumo = listaFlota.calcularConsumoTotalFlota(50, 1.50);
		System.out.println("Consumo de combustible: " + costeConsumo + "Litros/Km");
	}
}