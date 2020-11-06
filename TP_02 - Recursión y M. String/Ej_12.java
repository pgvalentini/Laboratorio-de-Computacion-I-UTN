package TrabajoPrácticoDos;
 import java.util.Scanner;
public class Ej_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.println(palabra.substring(4, 5));
    }
    
}
