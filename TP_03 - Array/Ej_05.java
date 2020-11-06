package TP_03;

public class Ej_05 {

 public static void main(String[] args) {
        
        int arreglo [] = new int [20];
        double promedio = 0;

        for (int i = 0; i < arreglo.length; i++) {  
            arreglo[i] = getNumeroAleatorio();
            promedio += arreglo[i];
        }
        
        promedio /= arreglo.length;

        System.out.println("El promedio aritmetico es: " + promedio);
        
        int promedioInt = (int)promedio;
        System.out.println("El promedio aritmetico entero es: " + promedioInt);

        int num = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == promedioInt) 
            num += 1;
            }

        num = 0;

        System.out.println("Hay " + num + " números iguales que el promedio aritmético");

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) 
            num += 1;
            }

        System.out.println("Hay " + num + " números mayores que el promedio aritmético");
        num = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) 
            num += 1;
            }

        System.out.println("Hay " + num + "números menores que el promedio aritmético"); //punto d

    }

    public static int getNumeroAleatorio () {
        double numero = Math.random()*100;
        if((int)numero%2==0){
            return (int)numero;
        }
        return getNumeroAleatorio();
    }


}
    

