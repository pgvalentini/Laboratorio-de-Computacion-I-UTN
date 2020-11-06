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
public class CostoComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet <Computadora> computadora = new HashSet <Computadora>();
        double suma=0;
        double venta=0;
        System.out.println("-------Cotización Computadora------");
        while(true){
            Computadora comp = new Computadora();
            System.out.println("MARCA");
            comp.setMarca(new Scanner(System.in).nextLine());
            System.out.println("MODELO");
            comp.setModelo(new Scanner(System.in).nextLine());
            computadora.add(comp);
            while(true){
                System.out.println("-------------------");
                ComponenteCPU compCPU = new ComponenteCPU ();
                System.out.println("Componentes");
                compCPU.setComponente(new Scanner(System.in).nextLine());
                System.out.println("Marca");
                compCPU.setMarca(new Scanner(System.in).nextLine());
                System.out.println("Cantidad");
                compCPU.setCantidad(new Scanner(System.in).nextInt());
                System.out.println("Precio");
                compCPU.setPrecio(new Scanner(System.in).nextDouble());
                comp.iniciarColeccion(compCPU);
                System.out.println("¿Continuar cargando componentes? SI O NO");
                String salirComponente = new Scanner(System.in).nextLine();
                if (salirComponente.equalsIgnoreCase("NO")) {break;}
            }
            System.out.println("¿Cotizar una nueva computadora?");
            String salirComputadora = new Scanner(System.in).nextLine();
            if (salirComputadora.equalsIgnoreCase("NO")) {break;}
        }
    
        for (Computadora c:computadora) {
            System.out.println("-------Computadora-----------");
            System.out.println("Marca: "+c.getMarca());
            System.out.println("Modelo "+c.getModelo());
            System.out.println("Componentes");
            System.out.println(completarEspacios("Componente")+"\t"+completarEspacios("Marca")+"\t"+completarEspacios("Cantidad")+"\t"+completarEspacios("Precio")+"\t"+completarEspacios("Subtotal"));
            for (ComponenteCPU dora:c.getComponenteCPU()) {
                System.out.println(completarEspacios(dora.getComponente())+"\t"+
                                   completarEspacios(dora.getMarca())+"\t"+
                                   completarEspacios(Integer.toString(dora.getCantidad()))+"\t"+
                                   completarEspacios(Double.toString(dora.getPrecio()))+"\t"+
                                   completarEspacios(Double.toString(dora.getCantidad()*dora.getPrecio())));
               suma += (dora.getCantidad()*dora.getPrecio());
            }
            System.out.println(completarEspacios("")+"\t"+completarEspacios("")+"\t"+completarEspacios("")+"\t"+
                                   completarEspacios("Costo Total")+"\t"+suma);
        }
        if (suma>50000) {
            venta=suma*0.3;
        }else {venta=suma*0.4;}
        System.out.println("Precio de venta sugerido "+suma+" + "+venta+" = "+(suma+venta));
    }
    public static String completarEspacios (String cadena){
        int espacios = 15 - cadena.length();
        if (espacios>0) {
            for (int i = 0; i < espacios; i++) {
                cadena += " ";
            }
        }
        return cadena;
    }
}