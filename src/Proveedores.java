import java.util.Date;

public class Proveedores {
    private String nombre;
    private int nit;
    private Date fechaorden;
    private Date fechaentrega;
    private Double montototal;

    public Proveedores(String nombre, int nit, Date fechaorden, Date fechaentrega, Double montototal) {
        this.nombre = nombre;
        this.nit = nit;
        this.fechaorden = fechaorden;
        this.fechaentrega = fechaentrega;
        this.montototal = montototal;
    }

    public Proveedores(String xiaomi, String s, Date time, Date time1) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Double getMontototal() {
        return montototal;
    }

    public void setMontototal(Double montototal) {
        this.montototal = montototal;
    }

    @Override
    public String toString() {
        return "Proveedores{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", fechaorden=" + fechaorden +
                ", fechaentrega=" + fechaentrega +
                ", montototal=" + montototal +
                '}';
    }
}
