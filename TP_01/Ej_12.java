package trabajopracticouno;

import java.util.Scanner;

public class Ej_12 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int día;
    System.out.println("Introduzca un día de la semana: ");
    día = sc.nextInt();
    
    if(día>7 || día<1){
        System.out.println("Introduzca un día de la semana: ");
        día=sc.nextInt();
    }
    
        switch (día) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            
            System.out.println("Día laboral");
                
                break;
            case 6:
            case 7:
            System.out.println("Día de descanso");
            
            default:
                System.out.println("No es un día entre semana: ");
        }
    
    
        
    }
    
}
