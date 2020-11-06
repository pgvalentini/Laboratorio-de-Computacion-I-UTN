package TP_05;

import java.util.Scanner;

public class Ej_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int suma=0,promedio,filas,columnas;
        boolean noHayPromedio=true;
        filas=filas();
        columnas=columnas();
        int[][] arreglo = new int[filas][columnas];
        llenarArreglo(arreglo, filas, columnas);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma+=arreglo[i][j];
            }
        }
        promedio=suma/(filas*columnas);
        System.out.println("El promedio de la matriz es: "+promedio);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(promedio==arreglo[i][j]){
                    System.out.println("El promedio si se encuentra en el arreglo");
                    System.out.println("En la fila "+(i+1)+" en la columna "+(j+1));
                    i=filas;
                    j=columnas;
                    noHayPromedio=false;
                }
            }
        }
        if(noHayPromedio){
            System.out.println("No existe el el promedio dentro del arreglo");
        }
    }
    private static int filas(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de filas del arreglo");
        int filas = sc.nextInt();
        if(filas<2){
            System.out.println("El arreglo debe tener mas de 2 filas");
            filas();    
        }
        return filas;
    }
    private static int columnas(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de columnas del arreglo");
        int columnas = sc.nextInt();      
        if(columnas<2){
            System.out.println("El arreglo debe tener mas de 2 columnas");
            columnas();    
        }
        return columnas;
    }
    private static int[][] llenarArreglo(int[][] arreglo, int filas, int columnas){
        Scanner sc = new Scanner (System.in);
        System.out.println("Complete el arreglo");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arreglo[i][j]=sc.nextInt();
            }
        }
        return arreglo;
    }
}
    

