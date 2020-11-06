package trabajopracticouno;
import java.util.Scanner;
public class Ej_11 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        String contraseña="tucontraseña";
  
        final int INTENTOS = 3;
        boolean acierto=false;
        String password;
        
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();
  
            if (password.equals(contraseña)){
                System.out.println("Felicitaciones, acertaste");
                acierto=true;
            }
        }
    }
}