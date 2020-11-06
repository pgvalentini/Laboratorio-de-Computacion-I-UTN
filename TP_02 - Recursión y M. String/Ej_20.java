package TrabajoPrácticoDos;

import java.util.Scanner;


public class Ej_20 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numerador");
        int numerador1 = sc.nextInt();
        System.out.println("Ingrese el primer denominador");
        int denominador1 = sc.nextInt();
        System.out.println("Ingrese el segundo numerador");
        int numerador2 = sc.nextInt();
        System.out.println("Ingrese el segundo denominador");
        int denominador2 = sc.nextInt();
        
        Fraccion f1 = new Fraccion(numerador1, denominador1);
        Fraccion f2 = new Fraccion(numerador2, denominador2);
        
        Fraccion suma = Fraccion.sumarFracciones(f1, f2);
        Fraccion resta = Fraccion.restarFracciones(f1, f2);
        Fraccion multiplicacion = Fraccion.multiplicarFracciones(f1, f2);
        Fraccion division = Fraccion.dividirFracciones(f1, f2);
        
        System.out.println(Fraccion.visualizarFraccion(suma));
        System.out.println(Fraccion.visualizarFraccion(resta));
        System.out.println(Fraccion.visualizarFraccion(multiplicacion));
        System.out.println(Fraccion.visualizarFraccion(division));
    }
}
