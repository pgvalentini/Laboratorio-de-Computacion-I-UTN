package TrabajoPrácticoDos;
import java.util.Scanner;

public class Ej_21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese un número: ");
        int entero = sc.nextInt();
        System.out.println("La suma es: "+suma(entero));
    }
   static int suma(int entero){
       if (entero==1){
           return 1;
       }else{
           return entero + suma(entero-1);
       }
       
   } 
}
