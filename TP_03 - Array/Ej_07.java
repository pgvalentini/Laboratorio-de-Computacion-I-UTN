package TP_03;

import java.util.Scanner;
public class Ej_07 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int dim = 10;
        int[] arreglo = new int[10];
               
        System.out.println("Ingrese los datos del arreglo");
        for(int h = 0;h<arreglo.length;h++){arreglo[h] = sc.nextInt();}

        int[] arregloAsc = ascendente(arreglo, arreglo.length);
        imprimirArreglo(arregloAsc, dim);

        System.out.println("");

        int[] arregloDesc = descendente(arreglo, arreglo.length);
        imprimirArreglo(arregloDesc, dim);

        System.out.println("");
        
    }


    public static int[] ascendente (int [] arregloAsc, int dim) {
        for(int i = 0; i < (arregloAsc.length-1) ; i++){
            for(int j = i+1 ; j<arregloAsc.length ; j++){
                if(arregloAsc[i] > arregloAsc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloAsc[i];
                    arregloAsc[i] = arregloAsc[j];
                    arregloAsc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloAsc;
    }
    
    public static int[] descendente (int [] arregloDesc, int dim) {
        for(int i = 0; i < (arregloDesc.length-1) ; i++){
            for(int j = i+1 ; j<arregloDesc.length ; j++){
                if(arregloDesc[i] < arregloDesc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloDesc[i];
                    arregloDesc[i] = arregloDesc[j];
                    arregloDesc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloDesc;
    }
    
    public static void imprimirArreglo (int [] arreglo, int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
}
