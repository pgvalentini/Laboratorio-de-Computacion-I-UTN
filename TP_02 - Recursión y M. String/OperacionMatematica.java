package TrabajoPrácticoDos;

public class OperacionMatematica {

    private double valor1,valor2;
    private String operacion;

    public OperacionMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        
    }

    public OperacionMatematica() {
    }

       
    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

        
    
    private double sumarNumeros(){
        return valor1 + valor2;
}
    private double restarNumeros(){
        return valor1 - valor2;
}
    private double multiplicarNumeros(){
        return valor1 * valor2;
}
    private double dividirNumeros(){
        return valor1 / valor2;
}
    public double aplicarOperacion(String operacion){
     double resultado;
        switch (operacion){
            case "+":
               resultado = sumarNumeros() ;
               break;
            case "-":
                resultado = restarNumeros();
                break;
            case "*":
                resultado = multiplicarNumeros();
                break;
            case "/":
                resultado = dividirNumeros();
                break;
            default:
                resultado = 0;
        }
        return resultado;        
}

}
