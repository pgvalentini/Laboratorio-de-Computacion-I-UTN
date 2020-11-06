package Tp_06;

import java.util.*;

public class Ej_02 {


    public static void main(String[] args) {
        ArrayList <Double> num = new ArrayList();
        double dec;
        System.out.println("Ingrese 20 números decimales");
        for (int i = 0; i < 20; i++) {
            dec=new Scanner(System.in).nextDouble();
            num.add(dec);
        }
        System.out.println("El mayor es "+Collections.max(num));
        System.out.println("El menor es "+Collections.min(num));
        double dif = Collections.max(num)-Collections.min(num);
        System.out.println("la diferencia es "+dif);
    }

}
    

