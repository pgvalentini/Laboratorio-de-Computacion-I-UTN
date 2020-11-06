package Tema_B_2020;
import java.util.*;
public class Alumno {
//Atributos
    private String nombreCompleto;
    private long legajo;
    private ArrayList <Notas> notas;
//GET Y SET
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public long getLegajo() {
        return legajo;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public ArrayList<Notas> getNota() {
        return notas;
    }
    public void setNota(ArrayList<Notas> notas) {
        this.notas = notas;
    }
//Métodos
    public void asignarFila (Notas nota){
        if (this.notas==null) {
            this.notas = new ArrayList <Notas>();
        }
        this.notas.add(nota);
    }
    public double promedioNotas (){
        double promedio=0;
        for(Notas n: this.notas){
            promedio += n.getNotaExamen()/notas.size();
        }
        return promedio;
    }
    
}
