package Tp_06;

import java.util.*;

public class Ej_03 {

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList();
        int numero,suma=0, promedio;
        int mayor=0,menor=0,igual=0;
        
        while(num.size()<20){
            numero=(int)(Math.random()*100);
            if (numero%2==0) {
             num.add(numero);   
            }
        }
        for(Integer n: num){
            suma += n;
        }
        promedio=suma/20;
        
        for(Integer n: num){
            if(n>promedio){
                mayor++;
            }
        }
        for(Integer n: num){
            if(n<promedio){
                menor++;
            }
        }
        for(Integer n: num){
            if(n==promedio){
                igual++;
            }
        }
        
        System.out.println("El promedio es "+promedio);
        System.out.println("Mayor al promedio "+mayor);
        System.out.println("Menor al promedio "+menor);
        System.out.println("iguales al promedio "+igual);
        
    }
    
}
