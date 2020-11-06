package TP_4;

import java.util.Scanner;

public class Ej_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dimension=dimArreglo();
        int[][] arreglo;
        int salir=1;
        int resultado;
        String seleccion=null;
        seleccion=menu(seleccion);
        while(seleccion.compareToIgnoreCase("a")!=0){
            System.out.println("Debe seleccionar primero la opción: 'a'");
            seleccion=menu(seleccion);
        }
        
        arreglo=llenarArreglo(dimension);
        
        while(salir==1){
            seleccion=menu(seleccion);
            System.out.println(opciones(arreglo, dimension, seleccion));
            System.out.println("Desea salir? presione 0");
            salir=sc.nextInt();
        }
    }
    
    
    public static int dimArreglo (){
        Scanner sc = new Scanner (System.in);
        int dim=0;
        do{
            System.out.println("Seleccione la dimensión del arreglo (Entre 4 y 10");
            dim = sc.nextInt();
        }while(dim<4||dim>10);
    return dim;
    }
    public static int[][] llenarArreglo (int dimension){
        Scanner sc = new Scanner(System.in);
        int[][] uni = new int[dimension][dimension];
        System.out.println("Complete el arreglo");
        for (int i = 0; i <dimension; i++) {
            for (int j = 0; j <dimension; j++) {
                System.out.println("Posición del arreglo: "+(i+1)+" - "+(j+1));
                uni[i][j]=sc.nextInt();
            }
        }
        return uni;
    }
    public static String menu (String seleccion){
        Scanner sc = new Scanner (System.in);
        System.out.println("Seleccione una opción");
        System.out.println("--------- MENU DE OPCIONES ---------");
        System.out.println("a) Rellenar TODA la matriz de números");
        System.out.println("b) Suma de una fila que se pedirá al usuario");
        System.out.println("c) Suma de una columna que se pedirá al usuario");
        System.out.println("d) Sumar la diagonal principal");
        System.out.println("e) Sumar la diagonal inversa");
        System.out.println("f) La media de todos los valores de la matriz");
        seleccion=sc.nextLine();
        return seleccion;
    }
    public static int sumaFila (int[][]arreglo, int dimension){
        Scanner sc = new Scanner (System.in);
        int fila,resultado=0;
        System.out.println("Seleccione la fila a sumar");
        fila=sc.nextInt();
        for (int i = 0; i < dimension; i++) {
            resultado += arreglo[(fila-1)][i];
        }
    return resultado;
    }
    public static int sumaColumna (int[][]arreglo, int dimension){
        Scanner sc = new Scanner (System.in);
        int columna,resultado=0;
        System.out.println("Seleccione la columna a sumar");
        columna=sc.nextInt();
        for (int i = 0; i < dimension; i++) {
            resultado += arreglo[i][(columna-1)];
        }
    return resultado;
    }
    public static int sumaDiagonal (int[][]arreglo, int dimension){
        int resultado=0;
        for (int i = 0; i < dimension; i++) {
            resultado += arreglo[i][i];    
        }
    return resultado;
    }
    public static int sumaDiagonalInversa (int[][]arreglo, int dimension){
        int resultado=0;
        int j=3;
        for (int i = 0; i < dimension; i++) {
            resultado += arreglo[j][i];
            j--;
            }    
    return resultado;
    }
    public static int promedioMatriz (int[][]arreglo, int dimension){
        int resultado=0;
        int promedio;
        for (int j =0; j<dimension ; j++) {
            for (int i = 0; i < dimension; i++) {
            resultado += arreglo[j][i];    
            }    
        }
        promedio=resultado/(dimension*dimension);
    return promedio;
    }
    public static int opciones(int[][]arreglo, int dimension,String seleccion){
        switch(seleccion){                
            case "b":
                return sumaFila(arreglo, dimension);
            case "c":
                return sumaColumna(arreglo, dimension);
            case "d":
                return sumaDiagonal(arreglo, dimension);
            case "e":
                return sumaDiagonalInversa(arreglo, dimension);
            case "f":
                return promedioMatriz(arreglo, dimension);
            default:
                return 0;
        }
          
    }
 
}
