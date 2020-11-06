package TP_03;

import java.util.Scanner;
    
public class Ej_10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int[] arreglo1 = getArregloIntConDimension(5);
        int[] arreglo2 = getArregloIntConDimension(10);
        int[] arreglo3 = new int [10];
        
        for (int j = 0; j < arreglo2.length ; j++){
            for (int i = 0; i < arreglo1.length; i++){
                arreglo3[j] += arreglo1[i] * arreglo2[j];
            }
        }
        
        imprimirArregloIntEnLinea(arreglo3, arreglo3.length);

    }
    
    public static int[] getArregloIntConDimension (int dim) {
        Scanner teclado = new Scanner(System.in);
        int arregloInt [] = new int [dim];
        System.out.println("Ingrese numero entero en arreglo de dimension "+ dim);
        for (int i = 0; i < dim; i++) {
            arregloInt[i] = teclado.nextInt();
        }
        return arregloInt;
    }

    public static void imprimirArregloIntEnLinea (int [] arreglo, int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

}