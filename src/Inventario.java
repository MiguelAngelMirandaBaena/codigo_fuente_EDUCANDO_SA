import java.util.Date;

public class Inventario {
    private Date fecha;
    private String Direccion;

    public Inventario(Date fecha, String direccion) {
        this.fecha = fecha;
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "fecha=" + fecha +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
