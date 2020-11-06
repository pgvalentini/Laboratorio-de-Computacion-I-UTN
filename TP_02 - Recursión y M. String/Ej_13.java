package TrabajoPrácticoDos;
import java.util.Scanner;
public class Ej_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();
        
        System.out.println(palabra1.indexOf(palabra2));
    }
    
}
