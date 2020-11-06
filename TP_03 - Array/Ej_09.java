package TP_03;

import java.util.Scanner;

public class Ej_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su número de DNI");
        int dni = sc.nextInt();
        int resto;
        resto=dni%23;
        System.out.println("La letra del DNI que corresponde es: "+obtenerLetra(resto));
        
        
    }
    public static char obtenerLetra (int resto){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[resto];
    } 
}
