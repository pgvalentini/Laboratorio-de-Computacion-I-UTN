package trabajopracticouno;
import java.util.Scanner;
public class Ej_14 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = new Double(Math.random() * 100).intValue();
    
      
    for (int i=0;i<100;i++){
    System.out.println("Ingrese un número entre 0 a 100");
    int num = sc.nextInt();
    
    if (num==x){
        System.out.println("Felicidades usted acertó, sus intentos fueron: " + (i+1));
        i=101;
    }else if (num>x){
        System.out.println("Su número es muy alto");
    }else {
        System.out.println("Su número es muy bajo");
    }
    }
    }
    
}
