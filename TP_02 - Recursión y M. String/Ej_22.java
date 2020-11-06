package TrabajoPrácticoDos;

import java.util.Scanner;
public class Ej_22 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un número");
        int numero = sc.nextInt();
        System.out.println("la suma de los dígitos del número es: "+ suma(numero));
        
    }
    static int suma (int numero){
        if(numero==0){
            return 0;
        }else{
            return suma(numero/10)+numero%10;
        }
    }
}
