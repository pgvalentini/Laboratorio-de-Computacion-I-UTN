package TrabajoPrácticoDos;
import java.util.Scanner;
public class Ej_23 {


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("ingrese una palabra o frase:");
        String palabra = sc.nextLine();
        
        System.out.println("La frase inversa es: "+inversa(palabra));
        
    }
    static String inversa (String palabra){
        if(palabra.length()==1){
            return palabra;
          }else {
            return inversa(palabra.substring(1)) + palabra.charAt(0);
        }
    }
}
