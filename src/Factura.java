import java.util.Date;

public class Factura {
    private int Numerodeentrada;
    private Date Fecha;
    private int NumeroFactura;
    private String Proveedor;
    private int items;

    public Factura(int numerodeentrada, Date fecha, int numeroFactura, String proveedor, int items) {
        Numerodeentrada = numerodeentrada;
        Fecha = fecha;
        NumeroFactura = numeroFactura;
        Proveedor = proveedor;
        this.items = items;
    }

    public int getNumerodeentrada() {
        return Numerodeentrada;
    }

    public void setNumerodeentrada(int numerodeentrada) {
        Numerodeentrada = numerodeentrada;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        NumeroFactura = numeroFactura;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "Numerodeentrada=" + Numerodeentrada +
                ", Fecha=" + Fecha +
                ", NumeroFactura=" + NumeroFactura +
                ", Proveedor=" + Proveedor +
                ", items=" + items +
                '}';
    }
}
