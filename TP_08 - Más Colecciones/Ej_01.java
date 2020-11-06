package TP_08;

import java.util.*;

public class Ej_01 {

    public static void main(String[] args) {
        HashMap <String,Long> agenda = new HashMap <String,Long> ();
        
        System.out.println("------------------");
        System.out.println("AGENDA DE TELÉFONO");
        System.out.println("------------------");
        while(true){
            System.out.println("----------------------------------------");
            System.out.println("Seleccione la acción que quiere realizar");
        ListarAgenda();
        int eleccion=new Scanner(System.in).nextInt();
        switch(eleccion){
            case 1:
                agenda.put(cargarNombre(),cargarTelefono());
                break;
            case 2:
                buscarTel(agenda);
                break;
            case 3:
                imprimirAgenda(agenda);
                break;
            default: System.out.println("Elección incorrecta");   
        }
        System.out.println("--------------");    
        System.out.println("¿Continuar? SI o NO");
            String continuar = new Scanner(System.in).nextLine();
            if (continuar.equalsIgnoreCase("NO")) {
                break;
            }
        }
        }
    public static String cargarNombre (){
        System.out.println("Nombre");
        String nombre = new Scanner(System.in).nextLine();
        return nombre;
    }
    public static long cargarTelefono(){
        System.out.println("Teléfono");
        Long tel = new Scanner(System.in).nextLong();
        return tel;
    }
    public static void buscarTel(HashMap <String,Long> agenda){
        String buscador = new Scanner(System.in).nextLine();
        if (agenda.get(buscador)!=0) {
            System.out.println("El número de teléfono es "+agenda.get(cargarNombre()));
        }else{
            System.out.println("Usuario no encontrado, ingrese un nuevo nombre");
            buscarTel(agenda);
        }
    }
    public static void ListarAgenda(){
        System.out.println("1- Cargar Datos en la Agenda\n" +
                           "2- Buscar Teléfono por Nombre\n" +
                           "3- Listar Agenda ");
    }
    public static void imprimirAgenda(HashMap <String,Long> agenda){
        System.out.println("-----------------------");
        System.out.println("La agenda telefónica completa es");
        System.out.println("NOMBRE"+"\t"+"\t"+"Teléfono");
        for (String a:agenda.keySet()) {
            System.out.println(a+"\t"+"\t"+agenda.get(a));
        }
    }
}
