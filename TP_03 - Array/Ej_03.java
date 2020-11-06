package TP_03;
import java.util.Scanner;
public class Ej_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Seleccione la cantidad de datos");
        int cant = sc.nextInt();
        int[] datos = new int[cant];
        System.out.println("Indique el multiplo");
        int mult = sc.nextInt();
        
        relleno(datos,cant, mult);
        mostrar(datos, cant);
   
    }
        
    public static void relleno (int[] datos,int cant,int mult){
        for(int i=0;i<datos.length;i++){
            datos[i]=(i+1)*mult;
        }
    }
    
    public static void mostrar (int[] datos,int cant){
        System.out.println("Los datos son");
        for (int j=0;j<datos.length;j++){
            System.out.println(datos[j]);
        }

    }
}
