import java.util.Date;

public class Solicitud {
    private String Nombre;
    private int codigosolicitud;
    private Date Fecha;
    private int nit;

    public Solicitud(String nombre, int codigosolicitud, Date fecha, int nit) {
        Nombre = nombre;
        this.codigosolicitud = codigosolicitud;
        Fecha = fecha;
        this.nit = nit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCodigosolicitud() {
        return codigosolicitud;
    }

    public void setCodigosolicitud(int codigosolicitud) {
        this.codigosolicitud = codigosolicitud;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "Nombre='" + Nombre + '\'' +
                ", codigosolicitud=" + codigosolicitud +
                ", Fecha=" + Fecha +
                ", nit=" + nit +
                '}';
    }
}
