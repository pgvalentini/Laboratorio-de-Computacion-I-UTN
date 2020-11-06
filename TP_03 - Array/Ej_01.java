package TP_03;

public class Ej_01 {

    public static void main(String[] args) {
        int [] entero = new int[5];
        entero[5]=15;
        //Esto es una error, ya que el arreglo comienza a ejecutarse en 0...
        // siendo 0, 1, 2, 3 y 4.
        // Para la posición 5 figura el error: ArrayIndexOutOfBoundsException: 5 
    }
    
}
