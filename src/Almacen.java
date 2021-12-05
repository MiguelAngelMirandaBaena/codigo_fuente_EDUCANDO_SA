import java.util.Date;

public class Almacen {
     private int numeroentrada;
     private Date Fecha;
     private int Numerodefactura;
     private String Direccion;
     private Date fechadeentrega;

     public Almacen(int numeroentrada, Date fecha, int numerodefactura, String direccion, Date fechadeentrega) {
          this.numeroentrada = numeroentrada;
          Fecha = fecha;
          Numerodefactura = numerodefactura;
          Direccion = direccion;
          this.fechadeentrega = fechadeentrega;
     }


     public int getNumeroentrada() {
          return numeroentrada;
     }

     public void setNumeroentrada(int numeroentrada) {
          this.numeroentrada = numeroentrada;
     }

     public Date getFecha() {
          return Fecha;
     }

     public void setFecha(Date fecha) {
          Fecha = fecha;
     }

     public int getNumerodefactura() {
          return Numerodefactura;
     }

     public void setNumerodefactura(int numerodefactura) {
          Numerodefactura = numerodefactura;
     }

     public String getDireccion() {
          return Direccion;
     }

     public void setDireccion(String direccion) {
          Direccion = direccion;
     }

     public Date getFechadeentrega() {
          return fechadeentrega;
     }

     public void setFechadeentrega(Date fechadeentrega) {
          this.fechadeentrega = fechadeentrega;
     }

     @Override
     public String toString() {
          return "Almacen{" +
                  "numeroentrada=" + numeroentrada +
                  ", Fecha=" + Fecha +
                  ", Numerodefactura=" + Numerodefactura +
                  ", Direccion='" + Direccion + '\'' +
                  ", fechadeentrega=" + fechadeentrega +
                  '}';
     }
}
