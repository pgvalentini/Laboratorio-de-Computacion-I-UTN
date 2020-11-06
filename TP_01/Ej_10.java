package trabajopracticouno;
import java.util.Scanner;
public class Ej_10 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numero;
    do{
        System.out.println("Escriba un número: ");
        numero=sc.nextInt();
    } while(numero<0);
    System.out.println(numero);
}
}