package TrabajoPrácticoDos;

import java.util.Scanner;
public class Ej_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        
        System.out.println(palabra1.equals(palabra2));
        System.out.println(palabra1.equalsIgnoreCase(palabra2));
        System.out.println(palabra1.compareTo(palabra2));
        
        
        
    }
    
}
