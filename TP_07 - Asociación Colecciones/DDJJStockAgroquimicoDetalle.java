package Tema_B_2020;



public class DDJJStockAgroquimicoDetalle {

//Atributos
private String Código;
private String Nombre;
private double CapacidadEnvase;
private int CantidadEnvases;
private double Subtotal;
private String NroLote;

//Métodos get y set

    public String getCódigo() {
        return Código;
    }

    public void setCódigo(String Código) {
        this.Código = Código;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCapacidadEnvase() {
        return CapacidadEnvase;
    }

    public void setCapacidadEnvase(double CapacidadEnvase) {
        this.CapacidadEnvase = CapacidadEnvase;
    }

    public int getCantidadEnvases() {
        return CantidadEnvases;
    }

    public void setCantidadEnvases(int CantidadEnvases) {
        this.CantidadEnvases = CantidadEnvases;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public String getNroLote() {
        return NroLote;
    }

    public void setNroLote(String NroLote) {
        this.NroLote = NroLote;
    }

    public DDJJStockAgroquimicoDetalle() {
    }

}
