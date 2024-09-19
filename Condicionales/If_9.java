package Condicionales;

public class If_9 {

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
		else if(a == 11) {
			System.out.println("else if_1.1");
		}
		else {
			System.out.println("else_2.2");
		}
	}
		else if(a == 10) {
			System.out.println("else if_1");
		}
		else if(a == 10) {
			System.out.println("else if_2");
		}
		if(a == 10) {
			System.out.println("if_2");
		}
		else if(a == 10) {
			System.out.println("else if_2.1");
		}
		else {
			System.out.println("else_2.2");
		}
		System.out.println("Variable a= " + a);
	}
}
