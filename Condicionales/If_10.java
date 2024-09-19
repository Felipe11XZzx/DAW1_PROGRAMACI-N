package Condicionales;

public class If_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		a = 10;
		
		if(a == 10) {
			System.out.println("if_1");
			if(a == 10) {
				System.out.println("if_1.1");
				a++;
			}
			else if(a == 10) {
				System.out.println("else if_1.1");
			}
			else {
				System.out.println("else_1.1");
			}
		}
		else {
			a = 12;
			System.out.println("else_2");
		}
		if(a == 11) {
			System.out.println("if_2");
		}
		System.out.println("Variable a= " + a);
	}

}
