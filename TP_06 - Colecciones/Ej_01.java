package Tp_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej_01 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    ArrayList <Integer> numeros = new ArrayList();
    Integer num;
    System.out.println("Ingrese números. Finalizará cuando el número ingresado sea negativo");
    do{
        num=sc.nextInt();
        System.out.println("-------");
        numeros.add(num);
        }while(num>=0);    
        System.out.println("Los número ingresados son");
        for(Integer n: numeros ){
            System.out.print(n+"\t");
        }
    }
    
}
