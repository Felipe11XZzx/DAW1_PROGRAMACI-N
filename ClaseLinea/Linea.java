package ClaseLinea;

public class Linea {

	private Punto puntoA, puntoB;
	
	public Linea(Punto Ppunto1, Punto Ppunto2) {
		
		if ((Ppunto1.getX() == Ppunto2.getX()) && (Ppunto1.getY() == Ppunto2.getY())){
			System.out.println("Puntos Invalidos Las Lineas Son Iguales.");
		}
		else {
		this.puntoA = Ppunto1;
		this.puntoB = Ppunto2;
		}
	}

	public void moverDerecha(double cantidadMover) {
		this.puntoA.AumentarEjeX(cantidadMover);;
		this.puntoB.AumentarEjeX(cantidadMover);
	}
	
	public void moverIzquierda(double cantidadMover) {
		this.puntoA.DisminuirEjeX(cantidadMover);;
		this.puntoB.DisminuirEjeX(cantidadMover);
	}
	
	public void moverArriba(double cantidadMover) {
		this.puntoA.DisminuirEjeY(cantidadMover);;
		this.puntoB.DisminuirEjeY(cantidadMover);
	}
	
	public void moverAbajo(double cantidadMover) {
		this.puntoA.AumentarEjeY(cantidadMover);;
		this.puntoB.AumentarEjeY(cantidadMover);
	}
	
	public static boolean sonParalelas(Linea linea1, Linea linea2) {
		double trayectoria1 = ((linea1.puntoB.getX() - linea1.puntoA.getX()) / ((linea1.puntoB.getY() - linea1.puntoA.getY())));
		double trayectoria2 = ((linea2.puntoB.getX() - linea2.puntoA.getX()) / ((linea2.puntoB.getY() - linea2.puntoA.getY())));
		return trayectoria1 == trayectoria2;
	}

	@Override
	public String toString() {
		return "Linea [ punto A =" + puntoA + ", punto B = " + puntoB + "]";
	}	
}