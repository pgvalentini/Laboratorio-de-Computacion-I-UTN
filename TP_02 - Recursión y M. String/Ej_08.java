package TrabajoPrácticoDos;
import java.util.Scanner;
public class Ej_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una palabra o frase: ");
        String frase = sc.nextLine();
        int CantCaracteres = frase.length();
        int Vocal = 0;
        for (int i=0; i<CantCaracteres;i++){
            if((frase.charAt(i)=='a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o')||(frase.charAt(i)=='u')){
                Vocal++;
            }
            }
        System.out.println("Tiene "+CantCaracteres+" caracteres y "+Vocal+" vocales.");
        String nueva = frase.replace("a", "e");
        System.out.println("La nueva frase es: "+nueva);
        }
}
        
   

