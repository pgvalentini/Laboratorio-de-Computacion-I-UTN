package trabajopracticouno;

import java.util.Scanner;

public class Ej_06 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese el precio del producto ");
    double precio = sc.nextDouble();
    double total;
    double iva = 1.21;
    total=precio*iva;
    System.out.println("El valor con IVA es de "+total);
       
    }
    
}
