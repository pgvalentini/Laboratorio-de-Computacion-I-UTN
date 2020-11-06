package Tema_B_2020;

import java.util.*;

public class CargaDDJJStockInicial {

    static String [][] agroquimicos = {
    {"1000","2EC JEBAGRO","A"},{"1001","D 60 GREEN CROPS","V"},{"1002","ESTER 97","A"},
    {"1003","AMINA ICONA SL","A"},{"1004","ABAMECTINA AGRO","A"},{"1005","FURACARB 31 TS","R"},
    {"1006","FURAFARM 48 F","R"},{"1007","ACETOCLOR ASSA","A"},{"1008","ACTIVE SIL","V"},{"1009","ABRIGO PLUS","V"}};
//El código - La denominación - La categoría del agroquímico a declarar siendo R (Rojo), A (Amarillo), V (Verde).   
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Instanciación
    DDJJStockAgroquimico ddjj = new DDJJStockAgroquimico();
        
        System.out.println("Razón Social");
        String razónSocial = cadenaNoVacia();
        ddjj.setEmpresa(razónSocial);
        
        System.out.println("CUIT");
        long cuit = Long.parseLong(tamañoNumeros());
        ddjj.setCuit(cuit);
        
        System.out.println("AÑO");
        int anio = añoCorrecto();
        ddjj.setAnioDeclaracion(anio);
        
        System.out.println("MES");
        int mes = mesCorrecto();
        ddjj.setMesDeclaracion(mes);
        
        while(true){
            System.out.println("-------------------------------------");
            String[] carga = buscarCódigo();
            System.out.println("El código fue encontrado "+carga[1]);
            System.out.println("Capacidad");
            double capacidad = sc.nextDouble();
            System.out.println("Cantidad");
            int cantidad = sc.nextInt();
            double subTotal;
            subTotal = capacidad*cantidad;
            String lote="";
            if (carga[2].equals("R")) {
                System.out.println("Lote número:");
                lote=cadenaNoVacia();
            }
            
            ddjj.asignarFilas(carga[0], carga[1], capacidad, cantidad, subTotal, lote);
            
            System.out.println("Para salir presione S, para continuar otro C");
            String salir;
            salir = sc.nextLine();
            
            if (salir.toUpperCase().equals("S")) {
               break;
            }
            
       }
        
        System.out.println("--------------DECLRACIÓN JURADA FINAL------------");
        ddjj.sumaTotal();
        imprimirDatos(ddjj);
        
    }
    
    public static String cadenaNoVacia(){
        String cadena = new Scanner(System.in).nextLine();
        if(cadena.isEmpty()){
            System.out.println("Debe ingresar un valor");
        cadenaNoVacia();
        }
        return cadena;
    }
    public static String tamañoNumeros(){
        String num = new Scanner(System.in).nextLine();
        if(num.length()!=11){
            System.out.println("Error, número ingresado incorrecto, vuelva a ingresar el CUIT");
            tamañoNumeros();
        }
    return num;    
    }
    public static int añoCorrecto(){
    int anio = new Scanner (System.in).nextInt();
    if(anio>2020){
        System.out.println("Error, ingrese el año correcto");
        añoCorrecto();
    }
    return anio;
    }
    public static int mesCorrecto(){
    int mes = new Scanner (System.in).nextInt();
    if(mes>10){
        System.out.println("Error, ingrese el mes correcto");
        mesCorrecto();
    }
    return mes;
    }
    public static int entreDiezyCero(){
        int num = new Scanner (System.in).nextInt();
        if(num<0||num>10){
            System.out.println("Erro, ingrese un número correcto");
            entreDiezyCero();
        }
        return num;
    }
    public static String[] buscarCódigo (){
        String[] codEncontrado = new String[3];
        System.out.println("--Ingrese el código del Agroquímico--");
        String código = new Scanner(System.in).nextLine();
        boolean encontrado = false;
        for (int i = 0; i < agroquimicos.length; i++) {
            if (agroquimicos[i][0].equals(código)) {
                codEncontrado[0] = agroquimicos[i][0];
                codEncontrado[1] = agroquimicos[i][1];
                codEncontrado[2] = agroquimicos[i][2];
                encontrado = true;
                break;
                }
        }
        if(!encontrado){
            System.out.println("Código no encontrado, ingrese uno correcto");
            buscarCódigo();
        }
        return codEncontrado;
    }
    public static String CompletarConEspacios(String cadena){
        int espacios = 20-cadena.length();
        if (espacios>0) {
           for (int i = 0; i < espacios; i++) {
           cadena+=" ";
            }
        }
        return cadena; 
    }
    public static void imprimirDatos(DDJJStockAgroquimico ddjj){
        System.out.println("Empresa "+ddjj.getEmpresa());
        System.out.println("CUIT "+ddjj.getCuit());
        System.out.println("Mes"+ddjj.getMesDeclaracion());
        System.out.println("Año"+ddjj.getAnioDeclaracion());
        System.out.println( CompletarConEspacios("Código")+
                            CompletarConEspacios("Nombre")+
                            CompletarConEspacios("Capacidad")+
                            CompletarConEspacios("Cantidad")+
                            CompletarConEspacios("Subtotal")+
                            CompletarConEspacios("N° Lote"));
        System.out.println( CompletarConEspacios("Agroquímico")+
                            CompletarConEspacios("Agroquímico")+
                            CompletarConEspacios("Envase kg./Lt")+
                            CompletarConEspacios("Envase")+
                            CompletarConEspacios("")+
                            CompletarConEspacios(""));
        for (DDJJStockAgroquimicoDetalle d:ddjj.getDetalleDDJJ()) {
        System.out.println(CompletarConEspacios(d.getCódigo())+
                            CompletarConEspacios(d.getNombre())+
                            CompletarConEspacios(Double.toString(d.getCapacidadEnvase()))+
                            CompletarConEspacios(Integer.toString(d.getCantidadEnvases()))+
                            CompletarConEspacios(Double.toString(d.getSubtotal()))+
                            CompletarConEspacios(d.getNroLote()));
        }
        System.out.println( CompletarConEspacios("")+
                            CompletarConEspacios("")+
                            CompletarConEspacios("")+
                            CompletarConEspacios("Total")+
                            ddjj.getTotal());
    }


}
