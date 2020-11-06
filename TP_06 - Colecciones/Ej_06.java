package Tp_06;

import java.util.*;

public class Ej_06 {

    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList ();
        ArrayList <Integer> numAscendete = new ArrayList ();
        ArrayList <Integer> numDescendente = new ArrayList ();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(100));
        }
        System.out.println("Números desordenados");
        mostrarArray(numeros);
        Collections.sort(numeros);
        System.out.println("\n");
        System.out.println("Números Descendente");
        mostrarArray(numeros);
        Comparator <Integer> comparador = Collections.reverseOrder();
        Collections.sort(numeros, comparador);
        System.out.println("\n");
        System.out.println("Números Ascendente");
        mostrarArray(numeros);
    }
    public static void mostrarArray (ArrayList <Integer> numeros){
    for(Integer i:numeros){
        System.out.print(i+"\t");
    }
    }
}
