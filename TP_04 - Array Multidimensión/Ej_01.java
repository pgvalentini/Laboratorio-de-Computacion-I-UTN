package TP_4;

import java.util.Scanner;

public class Ej_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] ciudades = new String[4][4];
        
        for(int i=0;i<4;i++){
            System.out.println("Ingrese un País y luego tres ciudades");
            for(int j=0;j<4;j++){
                ciudades[i][j] = sc.nextLine();
            }
        }
        
        System.out.println("Paises"+"\t"+"Ciudades");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(ciudades[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
