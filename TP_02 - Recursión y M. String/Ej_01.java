package TrabajoPrácticoDos;

import java.util.Scanner;

public class Ej_01 {
//datos, short, int, long, String, float investigue las diferentes formas de lograr la
//conversión. Muestre por pantalla el resultado de las conversiones.

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        double valorDecimal;
        
        //Ingreso de un número
        System.out.println("Ingrese un número decima: ");
        valorDecimal = sc.nextDouble();
        
        System.out.println("El número ingresado es: "+valorDecimal);
        
        //Operaciones Casting
        long l = (long)valorDecimal;
        System.out.println("Valor loung: "+l);
        
        int i = (int)valorDecimal;
        System.out.println("Valor entero: "+i);
        
        short s = (short)valorDecimal;
        System.out.println("Valor short: "+s);
        
        String g = String.valueOf(valorDecimal);
        System.out.println("Valor dato: "+g);
                      
        float f = (float)valorDecimal;
        System.out.println("Valor float: "+f);
       
        
    }
    
}
