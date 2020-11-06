package TP_03;

import java.util.Scanner;
public class Ej_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese 5 datos");
        int [] datos = new int [5];
        for(int i=0;i<5;i++){
            datos[i]=sc.nextInt();
        }
        
        System.out.println("Los números selecconados son:");
        for(int j=0;j<5;j++){
            System.out.println(datos[j]);
        }
    }
    
}
