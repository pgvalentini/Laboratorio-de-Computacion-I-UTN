package TrabajoPrácticoDos;
import java.util.Scanner;
public class Ej_02 {

    public static void main(String[] args) {
//Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)¿Qué ocurre?
//Aparece un error de incompatibiliad. " Value out of range. "
//Tenemos una escala de mayor a menor en cuanto rango de almacenamiento: double > float > long > int > short > byte
//¿Existe alguna forma de resolverlo? Ejemplifique. Poner una validación mediante un condicional compuesto 
//previo a una solicitud de una variable con mayor número de rango y la conversión al tipo de dato
//En caso de que queramos un byte        
        Scanner sc = new Scanner (System.in);
        int i;
        byte b;
        
        System.out.println("Ingrese un número: ");
        i = sc.nextInt();
        
        if (i<=127 && i>=-128){
            b=(byte)i;
            System.out.println("Byte es: "+b);
        }else System.out.println("El número ingresado no pertenece a un byte");
       
        
    }
    
}
