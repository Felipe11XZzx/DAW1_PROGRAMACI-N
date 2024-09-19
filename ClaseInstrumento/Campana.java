package ClaseInstrumento;

public class Campana extends Instrumento {

	public Campana() {
		super();
	}
	
	@Override
	public void interpretarInstrumento() {
		System.out.println();
		for(notasMusicales music : partitura) {
			switch(music) {
			case DO:
				System.out.println("DODODO");
				break;
			case RE:
				System.out.println("RERERE");
				break;
			case MI:
				System.out.println("SISISI");
				break;
			case FA:
				System.out.println("FAFAFA");
				break;
			case SOL:
				System.out.println("SOLSOLSOL");
				break;
			case LA:
				System.out.println("LALALA");
				break;
			case SI:
				System.out.println("SISISI");
				break;
				default : 
					System.out.println("NOTA MUSICAL INVALIDA");
			}
		}
	}	
}