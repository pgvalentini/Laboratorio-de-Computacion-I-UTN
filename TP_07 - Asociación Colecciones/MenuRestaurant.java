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
public class MenuRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Plato> platosMenu = new ArrayList<Plato>();
    
        while(true){
        Plato platos = new Plato ();
            System.out.println("NOMBRE");
            platos.setNombreCompleto(new Scanner(System.in).nextLine());
            System.out.println("PRECIO");
            platos.setPrecio(new Scanner(System.in).nextDouble());
            platosMenu.add(platos);
            
            System.out.println("¿Es bebida? SI o NO");
            String esBebida=new Scanner(System.in).nextLine();
            if (esBebida.equalsIgnoreCase("SI")) {
                platos.setEsBebida(true);
            }else platos.setEsBebida(false);
            
            while(!platos.isEsBebida()){
                Ingrediente ingre = new Ingrediente ();
                System.out.println("INGREDIENTES");
                System.out.println("Nombre");
                ingre.setNombre(new Scanner(System.in).nextLine());
                System.out.println("Cantidad");
                ingre.setCantidad(new Scanner(System.in).nextDouble());
                System.out.println("Medida");
                ingre.setMedida(new Scanner(System.in).nextLine());
                platos.agregarFilas(ingre);
            
                System.out.println("¿Otro ingrediente? SI O NO");
                String masIngre = new Scanner(System.in).nextLine();
                if (masIngre.equalsIgnoreCase("NO")) {break;}
            }
                System.out.println("¿Otro plato? SI O NO");
                String masIngre = new Scanner(System.in).nextLine();
                if (masIngre.equalsIgnoreCase("NO")) {break;}
        }
        System.out.println("-----MENÚ-----");
        imprimirDatos(platosMenu);
        
    }
    
public static void imprimirDatos(ArrayList <Plato> platosMenu){        
        for (Plato pm: platosMenu) {
            System.out.println(pm.getNombreCompleto());
            System.out.println("Precio: $ "+pm.getPrecio());
            if (!pm.isEsBebida()) {
            System.out.println("Ingredientes");
            System.out.println(completarEspacios("Nombre")+"\t"+completarEspacios("Cantidad")+"\t"+completarEspacios("Unidad de Medida"));
            for (Ingrediente ing: pm.getIngrediente()) {
                System.out.println(completarEspacios(ing.getNombre())+"\t"+completarEspacios(Double.toString(ing.getCantidad()))+"\t"+completarEspacios(ing.getMedida()));
            }    
            }
            System.out.println("---------------------");
        }
    }
public static String completarEspacios(String cadena){
    int espacios=15-cadena.length();
    if (espacios>0) {
        for (int i = 0; i < espacios; i++) {
            cadena += " ";
        }
    }
    return cadena;
}
    
}
