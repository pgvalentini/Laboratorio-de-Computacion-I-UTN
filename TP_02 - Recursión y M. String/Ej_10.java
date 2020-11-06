package TrabajoPrácticoDos;

import java.util.Scanner;
public class Ej_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frases = sc.nextLine();
        System.out.println("¿Quiere que la frase se escriba en MAYUSCULA o miniscula? true para mayuscula o false para minuscula");
        Boolean elección = sc.nextBoolean();
        if(elección=true){
            
            System.out.println(frases.toUpperCase());
            
        }else System.out.println(frases.toLowerCase());  
    }
    
}
