public class Personas {
    private String Nombre;
    private int Codigoempleado;
    private String Direcion;
    private int telefono;

    public Personas(String nombre, int codigoempleado, String direcion, int telefono) {
        Nombre = nombre;
        Codigoempleado = codigoempleado;
        Direcion = direcion;
        this.telefono = telefono;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCodigoempleado() {
        return Codigoempleado;
    }

    public void setCodigoempleado(int codigoempleado) {
        Codigoempleado = codigoempleado;
    }

    public String getDirecion() {
        return Direcion;
    }

    public void setDirecion(String direcion) {
        Direcion = direcion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "Nombre='" + Nombre + '\'' +
                ", Codigoempleado=" + Codigoempleado +
                ", Direcion='" + Direcion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
