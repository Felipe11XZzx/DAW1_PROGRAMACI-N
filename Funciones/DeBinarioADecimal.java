package Funciones;
import java.util.Scanner;

public class DeBinarioADecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número binario que quieres pasar a decimal: " + "\n");
        String Pcadena = entrada.next();
        entrada.close();
        System.out.println();
        
        int decimal = binarioADecimal(Pcadena);
        System.out.println("El número decimal equivalente es: " + decimal);
    }

    public static int binarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(longitud - 1 - i));
            decimal += digito * Math.pow(2, i);
        }
        return decimal;
    }
}