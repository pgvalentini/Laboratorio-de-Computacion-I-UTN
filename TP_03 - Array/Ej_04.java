package TP_03;

import java.util.Scanner;
public class Ej_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese 20 números decimales");
        double[] arreglo = new double[20];
        
        for (int i =0;i<arreglo.length;i++){arreglo[i]=sc.nextDouble();}
        
        double mayor =0;
        for(int i = 0;i<arreglo.length;i++){
            if (arreglo[i]>mayor){
            mayor=arreglo[i];
            }
        }
            System.out.println("El mayor es "+mayor);
        
        double menor=0;
        for(int i = 0;i<arreglo.length;i++){
            if(arreglo[i]<menor){
                menor=arreglo[i];
            }
        }
        System.out.println("el menor es "+menor);
    
        double rango;
        rango = mayor-menor;
        System.out.println("el Rango es "+rango);
    }
    
}
