package Condicionales;

public class RegulaClientes {
	
	public static void regulaClientes(boolean carroGrande, int cantidadProductos) {
		
		System.out.println();
		cantidadProductos = (int) (Math.random()*100) + 1;
		
		if(cantidadProductos % 2 == 0) {
			carroGrande = true;
		}
		else {
			carroGrande = false;
		}
		
		if((cantidadProductos > 2 && cantidadProductos < 10)) {
			System.out.println("Cantidad de productos: " + cantidadProductos + " , Pase por la caja de autopago por favor. " + "\n");
		}
		else if((cantidadProductos > 1 && cantidadProductos <= 2)) {
			System.out.println("Cantidad de productos: " + cantidadProductos + " , Pase por las cajas 1 y 2 por favor." + "\n");
		}
		if((carroGrande == false  && cantidadProductos > 10)) {
			System.out.println("Cantidad de productos: " + cantidadProductos + ", Pase por la caja 10 y 11 por favor. " + "\n");
		}
		else if((carroGrande == true && cantidadProductos > 10)) {
			System.out.println("Cantidad de productos: " + cantidadProductos + ", Pase por las cajas 12 y 14 por favor. " + "\n");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		regulaClientes(false, 0);
		regulaClientes(false, 0);
	}
}