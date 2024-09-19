package ClaseArchivador;

public class Main_Archivador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archivador a1 = new Archivador();
		
		a1.agregarNumeroExpediente(10);
		a1.agregarNumeroExpediente(99);
		a1.agregarNumeroExpediente(7);
		a1.agregarNumeroExpediente(4);
		a1.agregarNumeroExpediente(1);
		
		// ANTES DE ELIMINAR.
		System.out.println("\n" + "Antes de eliminar sin el array copy: " + a1.mostrarArchivador());
		
		// DESPUES DE ELIMINAR.
		a1.eliminarNumeroExpediente(0);
		System.out.println("Despues de eliminar sin el array copy: " + a1.mostrarArchivador());
		
		// DESPUES DE INSERTAR.
		a1.agregarExpedienteOrdenado(17, 0);
		System.out.println("Insertardo un expediente el archivador: " + a1.mostrarArchivador());
		
		// PROBANDO LAS FUNCIONES CON EL ARRAY COPY.
		
		Archivador a2 = new Archivador();
		a2.agregarNumeroExpediente(10);
		a2.agregarNumeroExpediente(99);
		a2.agregarNumeroExpediente(7);
		a2.agregarNumeroExpediente(4);
		a2.agregarNumeroExpediente(1);
		
		System.out.println("\n" + "Usando La Función Del Array Copy: " + a2.mostrarArchivador());
		a2.eliminarNumeroExpedienteOrdenado(0);
		System.out.println("Despues De Eliminar Con La Función Del Array Copy: " + a2.mostrarArchivador());
		a2.agregarExpedienteOrdenado(10, 4);
		System.out.println("Insertardo un expediente el archivador: " + a2.mostrarArchivador());
	}
}