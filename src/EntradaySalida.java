import java.util.Date;

public class EntradaySalida {
    private Date fechadesalida;
    private Date fechadeentrega;

    public EntradaySalida(Date fechadesalida, Date fechadeentrega) {
        this.fechadesalida = fechadesalida;
        this.fechadeentrega = fechadeentrega;
    }


    public Date getFechadesalida() {
        return fechadesalida;
    }

    public void setFechadesalida(Date fechadesalida) {
        this.fechadesalida = fechadesalida;
    }

    public Date getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(Date fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    @Override
    public String toString() {
        return "EntradaySalida{" +
                "fechadesalida=" + fechadesalida +
                ", fechadeentrega=" + fechadeentrega +
                '}';
    }
}
