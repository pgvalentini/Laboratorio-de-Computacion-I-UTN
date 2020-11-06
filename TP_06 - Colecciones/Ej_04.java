package Tp_06;

import java.util.*;

public class Ej_04 {

    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList();
        String palabras;
        System.out.println("Ingrese distintas palabras, para salir ingrese la palabra salir");
 
        do{
            palabras=new Scanner(System.in).nextLine();
            if(palabras.compareToIgnoreCase("salir")==0){break;}
            lista.add(palabras);
        }while(true);
        
        System.out.println("Las palabras ingresadas son");
        mostrarArrayList(lista);
        String masCaracteres = mayorcaracter(lista);
        System.out.println("\n"+"La palabra con mayor caracteres "+masCaracteres+" con "+masCaracteres.length());
        palabrasIguales(lista);
    }
    
    
    public static void mostrarArrayList (ArrayList <String> lista){
        for(String s: lista){
            System.out.print(s+"\t");
        }
    }
    public static String mayorcaracter(ArrayList <String> lista){
        String palabraMayor=" ";
        for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).length()>palabraMayor.length()){
                palabraMayor=lista.get(i);
        }   }
        return palabraMayor;
    }
    public static void palabrasIguales(ArrayList <String> lista){
    ArrayList <String> repetida = new ArrayList();
    int contador=0;
        for (String s : lista) {
            int igual=0;
            for (String t: lista) {
                if(s.compareToIgnoreCase(t)==0){
                    igual++;
                    if (igual>1 && !repetida.contains(s)){
                        contador++;
                        repetida.add(s);
                    }
                }
            }
        }
        if (!repetida.isEmpty()) {
            System.out.println("Hay "+contador+" palabras repetidas");
            for (String r: repetida) {
                System.out.print(r+"\t");
            }
        }else {System.out.println("No ahy palabras repetidas");}
    }
  

}
