package parcialunotemaa;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class Facturacion {
    
    private static final String[][] articulos = {{"101","Leche","25"},{"102","Gaseosa","30"},{"103","Fideos","15"}
            ,{"104","Arroz","28"},{"105","Vino","120"},{"106","Manteca","20"},{"107","Lavandina","18"}
            ,{"108","Detergente","46"},{"109","Jabón en Polvo","96"},{"110","Galletas","60"}};
    
    public static void main(String[] args) {
        
        Factura factura = new Factura();
        
        System.out.println("FACTURA X");
        System.out.println("Ingrese los siguientes datos;");
        System.out.println("Fecha de Factura:");
        String fecha = leerCadena();
        System.out.println("Nro de Factura");
        long nroFactura = leerNumeroEntero();
        System.out.println("Nombre del Cliente");
        String cliente = leerCadena();
        
        factura.setFechaFactura(fecha);
        factura.setNumeroFactura(nroFactura);
        factura.setCliente(cliente);
        
        System.out.println("Articulos a Facturar");
        while(true){
            System.out.println("---------------------------------------");
            String[] articuloEncontrado = buscarArticulo();
            System.out.println("El articulo " + articuloEncontrado[1].toUpperCase() + " ha sido encontrado.");
            System.out.println("Ingrese la cantidad de articulos " + articuloEncontrado[1].toUpperCase() + " a facturar");
            int cantidadArt = (int)leerNumeroEntero();
            double precio = Double.parseDouble(articuloEncontrado[2]);
            double descuento = 0;
            if(cantidadArt > 5){
                descuento = precio * 0.1;
            }
            double subTotal = (cantidadArt * precio) - (cantidadArt * descuento);
            factura.asignarDatos(articuloEncontrado[0], articuloEncontrado[1], cantidadArt, precio, descuento, subTotal);
            
            System.out.println("Desea salir de la carga de articulos?. Ingrese S para salir, otro caracter para continuar");
            String salir = leerCadena();
            if(salir.toUpperCase().equals("S")){
                break;
            }
             
        }
        factura.calcularMontoTotal();
        imprimirFactura(factura);
                
    }
    
    private static String[] buscarArticulo(){
        System.out.println("Ingrese el codigo del articulo a facturar");
        String codigo = leerCadena();
            
        String [] articulo = new String[3];
        boolean encontrado = false;
        for(int i=0; i < articulos.length; i++){
            if(articulos[i][0].equals(codigo)){
                articulo[0] = articulos[i][0];
                articulo[1] = articulos[i][1];
                articulo[2] = articulos[i][2];      
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El codigo " + codigo + " ingresado no  existe, intente nuevamente.");
            buscarArticulo();
        }
        return articulo;
    }
    
    private static long leerNumeroEntero(){
        long numero = new Scanner(System.in).nextLong();
        if(numero <= 0){
            System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            leerNumeroEntero();
        }
        return numero;
    }
    
    private static double leerNumeroDecimal(){
        double numero = new Scanner(System.in).nextDouble();
        if(numero <= 0){
            System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            leerNumeroDecimal();
        }
        return numero;
    }
    
    
    
    private static String leerCadena(){
        String cadena = new Scanner(System.in).nextLine();
        if(cadena.isEmpty()){
            System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente la cadena.");
            leerCadena();
        }
        return cadena;
    }
    
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
    
    private static void imprimirFactura(Factura factura){
        System.out.println("--------------------------------------------------------");
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Numero: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println(completarConEspacios("Código Articulo") + "\t"+completarConEspacios("Nombre Articulo")+"\t"+completarConEspacios("Cantidad")+"\t"+completarConEspacios("Precio Unitario")+"\t"+completarConEspacios("Descuento")+"\t"+completarConEspacios("Subtotal")+"");
        for(FacturaDetalle det : factura.getDetallesFactura()){
            System.out.println(completarConEspacios(det.getCodigo()) + "\t " + completarConEspacios(det.getNombreArticulo()) + " \t "
                    + completarConEspacios(Integer.toString(det.getCantidad())) + " \t " + completarConEspacios(Double.toString(det.getPrecioUnitario())) + " \t "
                    + completarConEspacios(Double.toString(det.getDescuento())) + " \t " + completarConEspacios(Double.toString(det.getSubtotal())) + "");
        }
        System.out.println("\t\t\t\t\t\t\t\tTotal: " + factura.getTotalCalculadoFactura());
        System.out.println("--------------------------------------------------------");
    }
    
}
