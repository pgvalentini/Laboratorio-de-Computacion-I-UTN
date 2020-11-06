package Tp_06;

public class Celda {
    
//Atributos
    private int fila;
    private int columna;
    private String valor;

//Métodos Get y Set
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public int getColumna() {
        return columna;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    
//Métodos constructores

    public Celda() {
    }

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
    

}
