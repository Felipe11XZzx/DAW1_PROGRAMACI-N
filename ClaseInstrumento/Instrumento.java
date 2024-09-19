package ClaseInstrumento;
import java.util.Arrays;

public abstract class Instrumento {

	protected notasMusicales [] partitura;
	
	public Instrumento() {
		this.partitura = new notasMusicales [0];
	}
	
	public void add(notasMusicales nota) {
		this.partitura = Arrays.copyOf(this.partitura, this.partitura.length + 1);
		this.partitura[this.partitura.length -1] = nota;
	}
	
	public abstract void interpretarInstrumento();
}