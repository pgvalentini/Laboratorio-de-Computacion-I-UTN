package Tema_B_2020;

import java.util.*;

public class DDJJStockAgroquimico {
    
//Atributos
 private int anioDeclaracion;
 private int mesDeclaracion;
 private String empresa;
 private long cuit;
 private double total;
 private ArrayList <DDJJStockAgroquimicoDetalle> detalleDDJJ;
// private String[][] detallesAgroquimico;

//Métodos GET Y SET
    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }
    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }
    public int getMesDeclaracion() {
        return mesDeclaracion;
    }
    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public long getCuit() {
        return cuit;
    }
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<DDJJStockAgroquimicoDetalle> getDetalleDDJJ() {
        return detalleDDJJ;
    }

    public void setDetalle(ArrayList<DDJJStockAgroquimicoDetalle> detalleDDJJ) {
        this.detalleDDJJ = detalleDDJJ;
    }

    public void asignarFilas( String codigo, String nombre,double capacidad,int cantidad, double subTotal,String lote){
        DDJJStockAgroquimicoDetalle detalle = new DDJJStockAgroquimicoDetalle();
        detalle.setCódigo(codigo);
        detalle.setNombre(nombre);
        detalle.setCantidadEnvases(cantidad);
        detalle.setCapacidadEnvase(capacidad);
        detalle.setSubtotal(subTotal);
        detalle.setNroLote(lote);
        
        if (this.detalleDDJJ == null) {
            this.detalleDDJJ = new ArrayList<DDJJStockAgroquimicoDetalle>();
        }
        
        this.detalleDDJJ.add(detalle);
        
    }
    public void sumaTotal(){
        double tot=0;
        for (DDJJStockAgroquimicoDetalle det:this.detalleDDJJ) {
            tot += det.getSubtotal();
        }
        this.total=tot;
    }

    
}
