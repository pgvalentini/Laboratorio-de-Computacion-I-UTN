/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_08;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class Computadora {
    private String marca;
    private String modelo;
    private HashSet <ComponenteCPU> ComponenteCPU;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet <ComponenteCPU> getComponenteCPU() {
        return ComponenteCPU;
    }

    public void setComponenteCPU(HashSet <ComponenteCPU> ComponenteCPU) {
        this.ComponenteCPU = ComponenteCPU;
    }
    
    public void iniciarColeccion (ComponenteCPU Componente){
        if (this.ComponenteCPU==null) {
            this.ComponenteCPU = new HashSet <ComponenteCPU>();
        }
        this.ComponenteCPU.add(Componente);
    }

}
