package Funciones;

public class FunciónNúmerosAmigos {

	public static boolean numerosAmigos(int PnumeroUno, int PnumeroDos) {
		
		int sumaDivisores1 = 0;
		int sumaDivisores2 = 0;
		
		for(int i = 1; i < PnumeroUno; i++) {
			if(PnumeroUno % i == 0){
				sumaDivisores1 += i;
			}
		}
		
		for(int k = 1; k < PnumeroDos; k++) {
			if(PnumeroDos % k == 0){
				sumaDivisores2 += k;
			}
		}
        return sumaDivisores1 == PnumeroDos && sumaDivisores2 == PnumeroUno;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n" + "Los números son amigos? " + numerosAmigos(220, 284));
	}
}