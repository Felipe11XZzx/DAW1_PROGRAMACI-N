package ClaseLinea;

public class Punto {

	private double ejeX;
	private double ejeY;
	
	public Punto(double PejeX, double PejeY) {
		this.ejeX = PejeX;
		this.ejeY = PejeY;
	}
	
	public double getY() {
		return this.ejeY;
	}
	
	public double getX() {
		return this.ejeX;
	}
	
	public void AumentarEjeX(double aumentarX) {
		this.ejeX = this.getX() + aumentarX;
	}
	
	public void AumentarEjeY(double aumentarY) {
		this.ejeY = this.getY() + aumentarY;
	}
	
	public void DisminuirEjeX(double disminuirX) {
		this.ejeX = this.getX() - disminuirX;
	}
	
	public void DisminuirEjeY(double disminuirY) {
		this.ejeY -= this.getY() - disminuirY;
	}

	@Override
	public String toString() {
		return "Punto [ eje X =" + ejeX + ", eje Y =" + ejeY + "]";
	}
	
	
}