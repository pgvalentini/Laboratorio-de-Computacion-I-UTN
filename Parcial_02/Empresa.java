/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_2_2020_LAB;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class Empresa {
private String cuit;
private String razonSocial;
private ArrayList <Empleado> empleados;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList <Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList <Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void iniciarArray(Empleado empleado){
        if(this.empleados==null){
            this.empleados = new ArrayList <Empleado>(); 
        }
        this.empleados.add(empleado);
    }

}
