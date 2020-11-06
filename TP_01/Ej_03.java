package trabajopracticouno;

public class Ej_03 {

    public static void main(String[] args) {
    
    int num1 = 6;
    int num2 = 3;
    int suma, div, resta, mul, mod;
    
    
    suma = num1 + num2;
    resta = num1 - num2;
    div = num1/num2;
    mul = num1*num2;
    mod = num1%num2;
       
    System.out.println("El resultado de la suma de los números: " +num1+" y "+num2+" es: "+suma);
    System.out.println("El resultado de la resta de los números: " +num1+" y "+num2+" es: "+resta);
    System.out.println("El resultado de la división de los números: " +num1+" y "+num2+" es: "+div);
    System.out.println("El resultado de la multiplicación de los números: " +num1+" y "+num2+" es: "+mul);
    System.out.println("El resultado de la módulo de los números: " +num1+" y "+num2+" es: "+mod);
    }
    
}
