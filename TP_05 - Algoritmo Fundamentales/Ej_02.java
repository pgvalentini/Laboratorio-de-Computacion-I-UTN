package TP_05;


public class Ej_02 {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=((int)(Math.random()*100));
        }
        
        System.out.println("Mostrar el arreglo desordenado");
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]+" - ");            
        }
        System.out.println(" ");
        insercion(arreglo);
        burbuja(arreglo);
        selección(arreglo);
        busquedasecuencial(arreglo);
        
    }
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
    public static void busquedasecuencial(int arreglo[]){
        int n = arreglo.length;
        boolean seEncontro=false;
        for (int i = 0; i < n-1; i++) {
            if(arreglo[i]==29){
                seEncontro=true;
                System.out.println(" ");
                System.out.println("Se encontro");
            }   
        }
        
}


}
