package Funciones;
import java.util.Scanner;
public class Función_ComprobarFecha {
	
	public static boolean comprobarFecha(int Pdia, int Pmes, int PAño) {
		
		   int dia,mes,año;
	       boolean resultado=false;
	       Scanner entrada=new Scanner(System.in);
	       System.out.println("Introduce día en número" + "\n");
	       dia=entrada.nextInt();
	       System.out.println();
	       
	       System.out.println("Introduce mes en número" + "\n");
	       mes=entrada.nextInt();
	       System.out.println();
	       
	       System.out.println("Introduce año en número" + "\n");
	       año=entrada.nextInt();
	       System.out.println();
	       
	       if (año==0) {//comprobamos el año        
	           resultado=false;
	       }

	       else if ((mes==2)&&(dia>0)&&(dia<29)){//comprobamos febrero
	           resultado=true;
	       }

	       else if (((mes==9)||(mes==4)||(mes==6)||(mes==11))&&((dia>0)&&(dia<31))){//Comprobamos
	           //los meses que tienen 30 días
	           resultado=true;
	       }

	       else if (((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)

	               ||(mes==12)||(mes==10))&&(dia>0)&&(dia<32)) {//Comprobamos los meses que tienen 31 días

	           resultado=true;
	       }
	       else {
	           resultado=false;
	       }
	       if (resultado==true) {
	           System.out.println("Fecha correcta");
	       }
	       else {
	           System.out.println("Fecha incorrecta");
	       }    
	       entrada.close();
		return resultado;
	}
	
   public static void main(String[] args) {

       // TODO Auto-generated method stub

       //Pedir día, mes y año e indicar si la fecha es correcta.
       //Tener en cuenta que hay meses con 28, 30 y 31 días
	   
	   comprobarFecha(0, 0, 0);
   }
}