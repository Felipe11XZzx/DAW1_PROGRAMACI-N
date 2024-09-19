package ClaseInstrumento;

public class Main_Instrumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Piano piano1 = new Piano();
		notasMusicales notasPiano [] = {notasMusicales.DO, notasMusicales.RE, notasMusicales.SI, notasMusicales.FA};
		
		for(int i = 0; i < notasPiano.length; i++) {
			piano1.add(notasPiano[i]);
		}
		piano1.interpretarInstrumento();
		
		Campana campana1 = new Campana();
		notasMusicales notasCampana [] = {notasMusicales.SOL, notasMusicales.SOL, notasMusicales.SI, notasMusicales.FA};
		
		for(int k = 0; k < notasCampana.length; k++) {
			campana1.add(notasCampana[k]);
		}
		campana1.interpretarInstrumento();
	}
}