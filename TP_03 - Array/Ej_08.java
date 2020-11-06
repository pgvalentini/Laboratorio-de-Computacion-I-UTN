package TP_03;

import java.util.Scanner;
        
public class Ej_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numeros enteros separados por guiones medios");
        String cadena = sc.next();
        
        String[] arreglo = cadena.split("-");
        int[] arregloInt = getArregloStringToInt(arreglo, arreglo.length);

        System.out.println("La suma es: "+getSumaArregloInt(arregloInt, arregloInt.length));
        System.out.println("El promedio es: "+getPromedioArregloInt(arregloInt, arregloInt.length));
    } 

    public static int getSumaArregloInt (int [] arregloInt, int dim) {
        int suma = 0;
        for (int i = 0; i < dim; i++) {
            suma += arregloInt[i];
        }
        return suma;
    }

    public static double getPromedioArregloInt (int [] arregloInt, int dim) {
        double promedio = 0;
        for (int i = 0; i < dim; i++) {
            promedio += arregloInt[i];
        }
        return promedio/arregloInt.length;
    }

    public static int[] getArregloStringToInt (String [] arregloString, int dim) {
        int arregloInt [] = new int [dim];
        for (int i = 0; i < dim; i++){
            arregloInt[i] = Integer.parseInt(arregloString[i]);
        }
        return arregloInt;
    }

}