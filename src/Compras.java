import java.util.Date;

public class Compras {
    private int Numerodesolicitud;
    private Date Fecha;
    private int Cotizacion;

    public Compras(int numerodesolicitud, Date fecha, int cotizacion) {
        Numerodesolicitud = numerodesolicitud;
        Fecha = fecha;
        Cotizacion = cotizacion;
    }

    public int getNumerodesolicitud() {
        return Numerodesolicitud;
    }

    public void setNumerodesolicitud(int numerodesolicitud) {
        Numerodesolicitud = numerodesolicitud;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(int cotizacion) {
        Cotizacion = cotizacion;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "Numerodesolicitud=" + Numerodesolicitud +
                ", Fecha=" + Fecha +
                ", Cotizacion=" + Cotizacion +
                '}';
    }
}
