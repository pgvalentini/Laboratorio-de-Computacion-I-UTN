/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_2_2020_LAB;

/**
 *
 * @author Pablo
 */
public class Empleado {
    private String nombreCompleto;
    private int legajo;
    private double salario;
    private NivelAcademico nivelAcademico;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    public double salarioTotalCalculado(){
        double total;
        
        total = this.salario * (1+(this.nivelAcademico.getPorcentajeAumento()/100));
        
        return total;
    }

}
