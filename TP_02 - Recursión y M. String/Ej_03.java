package TrabajoPrácticoDos;

//Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
//999) y por medio del uso de las operaciones matemáticas módulo 10 y división
//por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
//del algoritmo 14.

import java.util.Scanner;
public class Ej_03 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número de 3 dígitos: ");
        int numero = sc.nextInt();
        if(numero>=100 && numero<=999){
        int modulo1, modulo2,divisor1, divisor2,resultado;
        modulo1 = numero%10;
        divisor1 = numero/10;
        modulo2 = divisor1%10;
        divisor2 = divisor1/10;
        resultado = modulo1+modulo2+divisor2;
        System.out.println("El resultado de la suma de los tres dígitos es:"+resultado);
        }else System.out.println("El número ingresado debe estar entre 100 y 999");       
        
    }
    
}
