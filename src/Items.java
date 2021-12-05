import java.util.Date;

public class Items {
    private String Nombre;
    private int Cantidad;
    private int CodigoUniversal;
    private Date Fecha;

    @Override
    public String toString() {
        return "Items{" +
                "Nombre='" + Nombre + '\'' +
                ", Cantidad=" + Cantidad +
                ", CodigoUniversal=" + CodigoUniversal +
                ", Fecha=" + Fecha +
                '}';
    }

    public Items(String nombre, int cantidad, int codigoUniversal, Date fecha) {
        Nombre = nombre;
        Cantidad = cantidad;
        CodigoUniversal = codigoUniversal;
        Fecha = fecha;


    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getCodigoUniversal() {
        return CodigoUniversal;
    }

    public void setCodigoUniversal(int codigoUniversal) {
        CodigoUniversal = codigoUniversal;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}