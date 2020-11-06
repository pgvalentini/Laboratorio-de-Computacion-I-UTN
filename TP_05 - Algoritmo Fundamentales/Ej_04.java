package TP_05;

import java.util.Scanner;

public class Ej_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo=new int[20];
        
        System.out.println("Ingrese datos al siguiente arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=sc.nextInt();
        }
        
            System.out.println("Seleccione el método"+"\n"+"1 - ASCInserción"+"\n"+"2 - ASCBurbuja"+"\n"+"3 - ASCSelección"
                                                     +"\n"+"4 - DESCInserción"+"\n"+"5 - DESCBurbuja"+"\n"+"6 - DESCSelección"
            );    
            int metodo;
            metodo=sc.nextInt();
            switch(metodo){
                case 1:
                    insercion(arreglo);
                    break;
                case 2:    
                    burbuja(arreglo);
                    break;
                case 3:    
                    selección(arreglo);
                    break;

                case 4:
                    desInsercion(arreglo);
                    break;
                case 5:    
                    desBurbuja(arreglo);
                    break;
                case 6:    
                    desSelección(arreglo);
                    break;
            }
    }

    //Ascendente
    public static void insercion(int [] arreglo){

        for (int i = 1; i < arreglo.length; i++) {
            int valor = arreglo[i];
            int j = i-1;
            while (j>=0 && arreglo[j]> valor){
                arreglo[j+1]=arreglo[j];
                j--;
            }   
        arreglo[j+1]=valor;
        }
        
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por INSERCIÓN");
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]+" - ");            
        }
        System.out.println(" ");
    }
    public static void burbuja(int[] arreglo){
        int n=arreglo.length;
        boolean intercambiado = false;
        do{
            for (int i = 1; i < n; i++) {
                if(arreglo[i-1]>arreglo[i]){
                    int aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i]=aux;
                    intercambiado=true;
                }
            }
        }while(intercambiado==true);
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por BURBUJA");
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]+" - ");            
        }
        System.out.println(" ");
}   
    public static void selección(int[] arreglo){
          int i, j, menor, pos, tmp;
          for (i = 0; i < arreglo.length - 1; i++) {        // tomamos como menor el primero
                menor = arreglo[i];                         // de los elementos que quedan por ordenar                    
                pos = i;                                    // y guardamos su posición
                for (j = i + 1; j < arreglo.length; j++){   // buscamos en el resto
                      if (arreglo[j] < menor) {             // del array algún elemento
                          menor = arreglo[j];               // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                              // si hay alguno menor se intercambia                         
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
          }
        
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por SELECCIÓN");
        for (int k = 0; k < arreglo.length; k++) {
            System.out.print(arreglo[k]+" - ");
        }
        System.out.println(" ");

}
    
    //Descendente
    public static void desInsercion(int [] arreglo){

        for (int i = 1; i < arreglo.length; i++) {
            int valor = arreglo[i];
            int j = i-1;
            while (j>=0 && arreglo[j]< valor){
                arreglo[j+1]=arreglo[j];
                j--;
            }   
        arreglo[j+1]=valor;
        }
        
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por INSERCIÓN");
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]+" - ");            
        }
        System.out.println(" ");
    }
    public static void desBurbuja(int[] arreglo){
        int n=arreglo.length;
        boolean intercambiado = false;
        do{
            for (int i = 1; i < n; i++) {
                if(arreglo[i-1]<arreglo[i]){
                    int aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i]=aux;
                    intercambiado=true;
                }
            }
        }while(intercambiado==true);
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por BURBUJA");
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]+" - ");            
        }
        System.out.println(" ");
}   
    public static void desSelección(int[] arreglo){
          int i, j, menor, pos, tmp;
          for (i = 0; i < arreglo.length - 1; i++) {        // tomamos como menor el primero
                menor = arreglo[i];                         // de los elementos que quedan por ordenar                    
                pos = i;                                    // y guardamos su posición
                for (j = i + 1; j < arreglo.length; j++){   // buscamos en el resto
                      if (arreglo[j] > menor) {             // del array algún elemento
                          menor = arreglo[j];               // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                              // si hay alguno menor se intercambia                         
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
          }
        
        System.out.println(" ");
        System.out.println("Mostrar el arreglo ORDENADO por SELECCIÓN");
        for (int k = 0; k < arreglo.length; k++) {
            System.out.print(arreglo[k]+" - ");
        }
        System.out.println(" ");

}    
    
}
