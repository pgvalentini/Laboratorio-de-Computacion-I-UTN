package TP_4;

import java.util.Scanner;

public class Ej_03 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim=0;
        
        int dimension = dimensionArreglo(dim);
        
        int[][] arreglo = llenarArreglo(dimension);
        
        System.out.println("");
        mostrarArreglo(arreglo);
        
        System.out.println("");
        int [] unafila = sumarArreglo(arreglo, dimension);
        mostrarUniArreglo(unafila, dimension);
        
        System.out.println("");
        System.out.println(sumafila(unafila, dimension));
        
              
    }
    
    public static int dimensionArreglo (int dim){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Ingrese la cantidad de filas y columnas de la matriz");
            System.out.println("Las mismas tienen que ser entre 3 y 10");
            dim = sc.nextInt(); 
        }while( dim<3 || dim>10);
        return dim;
    }
    public static int[][] llenarArreglo (int dimension){
        Scanner sc = new Scanner(System.in);
        int[][] uni = new int[dimension][dimension];
        System.out.println("Complete el arreglo");
        for (int i = 0; i <dimension; i++) {
            for (int j = 0; j <dimension; j++) {
                System.out.println("Número del arreglo: "+(i+1)+" - "+(j+1));
                uni[i][j]=sc.nextInt();
            }
        }
        return uni;
    }
    public static void mostrarArreglo (int [][] arreglo){
        System.out.println("El arreglo que usted lleno es");
        int [][] uni = new int[arreglo.length][arreglo[0].length];
        for (int i = 0; i < uni.length; i++) {
            for (int j = 0; j < uni[0].length; j++) {
                System.out.print(arreglo[i][j]+"\t");
            }System.out.println("");
        }
    }
    public static void mostrarUniArreglo (int [] unafila, int dimension){
        System.out.println("La suma de las columnas");
        for (int i = 0; i < dimension; i++) {
            System.out.print(unafila[i]+"\t");
        }
    }
    public static int[] sumarArreglo (int[][] arreglo, int dimension){
        int[] uni = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                uni[i]+=arreglo[j][i];
            }
        }
     return uni;   
    }
    public static int sumafila (int[]unafila, int dimension){
        System.out.println("Ls suma de la fila es");
        int resultado=0;
        for (int i = 0; i < dimension; i++) {
            resultado+=unafila[i];
        }
        return resultado;
    }
}
