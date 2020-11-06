package Tp_06;
import java.util.*;
public class Ej_05 {

    public static void main(String[] args) {
        ArrayList <Integer> aleatorio = new ArrayList();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int contador=0;
        boolean encontrado=false;
        
        for (int i = 0; i < 50; i++) {
          aleatorio.add(r.nextInt(100));
        }
        
        System.out.println("Ingrese un número a buscar entre el 0 a 100");
        Integer x = sc.nextInt();
        
        for(Integer a:aleatorio){
            if (x.equals(a)) {
                contador=aleatorio.indexOf(a);
                encontrado=true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Se encontro el valor en la posición "+contador);
        }else{System.out.println("No fue encontrado");}
    }
    
}
