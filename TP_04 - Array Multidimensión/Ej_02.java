package TP_4;

import java.util.Scanner;

public class Ej_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas del arreglo");
        int x=sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas del arreglo");
        int y=sc.nextInt();
        
        int[][] arreglo1 = rellnarArreglo(x, y);
        int[][] arreglo2 = rellnarArreglo(x, y);
        System.out.println(" ");
        
        int[][] arreglo3 = multiplicarArreglo(arreglo1, arreglo2);
        imprimirArreglo(arreglo3);
        
        
    }
    public static int[][] rellnarArreglo(int x,int y){
        Scanner sc = new Scanner(System.in);
        int[][] arreglo = new int[x][y];
        for (int i = 0;i<x; i++) {
            for (int j = 0;j<y; j++) {
                System.out.println("Complete el arreglo" + (i+1) + " - " + (j+1));
                arreglo[i][j]=sc.nextInt();
            }
        }
        return arreglo;
    }
    public static int[][] multiplicarArreglo(int[][]arreglo1,int[][] arreglo2){
        int[][] multiplicaArreglo = new int[arreglo1.length][arreglo1[0].length];
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[0].length; j++) {
                multiplicaArreglo[i][j]+= arreglo1[i][j]*arreglo2[j][i];
            }
        }
    return multiplicaArreglo;
    }
    public static void imprimirArreglo (int[][] arreglo){
        int[][] imprimearreglo = new int[arreglo.length][arreglo[0].length];
        for (int i = 0;i<imprimearreglo.length; i++) {
            for (int j = 0;j<imprimearreglo[0].length; j++) {
                System.out.print(arreglo[i][j]+"\t");
            }
            System.out.println(" ");
            }
            System.out.println(" ");
    }
}
