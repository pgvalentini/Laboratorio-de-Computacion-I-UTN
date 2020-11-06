/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_B_2020;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList <Ingrediente> ingrediente;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public void agregarFilas(Ingrediente ingrediente){
        if (this.ingrediente==null) {
            this.ingrediente = new ArrayList <Ingrediente>();
        }
        this.ingrediente.add(ingrediente);
    }
}
