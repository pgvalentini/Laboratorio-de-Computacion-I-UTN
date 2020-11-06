package TP_03;

import java.util.Scanner;

public class Ej_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arreglo = new int [50];
        
        for(int i=0;i<arreglo.length;i++){
            double numero = Math.random()*100;
            int numeroint = (int)numero;
            arreglo[i]=numeroint;
        }
        System.out.println("Ingrese el valor a buscar");
        int buscador = sc.nextInt();
        boolean perdedor = true;
        for(int j=0;j<arreglo.length;j++){
            if(buscador==arreglo[j]){
                System.out.println("Felicitaciones! acertaste");
                System.out.println("En la posición "+(j+1));
                j=arreglo.length;
                perdedor=false;
            }
        }
        if(perdedor=true){System.out.println("Segui participando");}
    }
    
}
