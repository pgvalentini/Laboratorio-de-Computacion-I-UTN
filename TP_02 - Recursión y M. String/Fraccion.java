package TrabajoPrácticoDos;

public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public static Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int aux1 = f1.numerador * f2.denominador;
        int aux2 = f2.numerador * f1.denominador;
        int numeradorResultado = aux1 + aux2;
        int denominadorResultado = f1.denominador * f2.denominador;
        
        Fraccion resultado = new Fraccion (numeradorResultado, denominadorResultado);
        
        return resultado;
    } 
    
    public static Fraccion restarFracciones(Fraccion f1, Fraccion f2){
               
        int aux1 = f1.numerador * f2.denominador;
        int aux2 = f2.numerador * f1.denominador;
        int numeradorResultado = aux1 - aux2;
        int denominadorResultado = f1.denominador * f2.denominador;
        
        Fraccion resultado = new Fraccion (numeradorResultado, denominadorResultado);
        
        return resultado;
    }
    
    public static Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int numeradorResultado = f1.numerador * f2.numerador;
        int denominadorResultado = f2.denominador * f1.denominador;
        
        Fraccion resultado = new Fraccion (numeradorResultado, denominadorResultado);
        
        return resultado;
    }

    public static Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int numeradorResultado = f1.numerador * f2.denominador;
        int denominadorResultado = f1.denominador * f2.numerador;
        
        Fraccion resultado = new Fraccion (numeradorResultado, denominadorResultado);
        
        return resultado;
    } 
    
    public static String visualizarFraccion(Fraccion f1){
        
        return f1.numerador + "/" + f1.denominador;
    }
}
