/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialunotemaa;


import java.util.ArrayList;
/**
 *
 * @author Gerardo
 */
public class Factura {
  
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<FacturaDetalle> detallesFactura;

    public ArrayList<FacturaDetalle> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<FacturaDetalle> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
    public void calcularMontoTotal(){
        double total=0;
        for(FacturaDetalle det : this.detallesFactura){
            total += det.getSubtotal();
        }
        this.totalCalculadoFactura = total;
    }
    
    public void asignarDatos(String codigo, String nombre, int cantidad, double precio, double descuento, double subTotal){
        
        FacturaDetalle detalle = new FacturaDetalle();
        detalle.setCantidad(cantidad);
        detalle.setCodigo(codigo);
        detalle.setDescuento(descuento);
        detalle.setNombreArticulo(nombre);
        detalle.setPrecioUnitario(precio);
        detalle.setSubtotal(subTotal);
        if(this.detallesFactura == null){
            this.detallesFactura = new ArrayList<FacturaDetalle>();
        }
        this.detallesFactura.add(detalle);
    }
    
}
