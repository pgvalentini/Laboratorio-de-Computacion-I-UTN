package TrabajoPrácticoDos;
import java.util.Scanner;
public class Ej_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese otro número: ");
        double numero2 = sc.nextDouble();
        
        OperacionMatematica cuentas = new OperacionMatematica(numero1, numero2);
               
        System.out.println("La suma es "+cuentas.aplicarOperacion("+"));
        System.out.println("La resta es "+cuentas.aplicarOperacion("-"));
        System.out.println("La multiplicación es: "+cuentas.aplicarOperacion("*"));
        System.out.println("La división es "+cuentas.aplicarOperacion("/"));
       
    }   

      
}
