import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        //Producto
        Items items = new Items("Pilot",40,0001,Calendar.getInstance().getTime());
        //Empelado
        Personas personas = new Personas("Felipe",3321,"Calle Falsa 123",75931857);
        //Orden
        Solicitud solicitud = new Solicitud("Pilot",6654,Calendar.getInstance().getTime(),220);
        //Proviene de Almacen
        Almacen Almacen = new Almacen(221,Calendar.getInstance().getTime(), 77652,"Calle falsa 123",Calendar.getInstance().getTime());
        //Inventario
        Inventario inventario = new Inventario(Calendar.getInstance().getTime(), "Calle falsa 123");
        //Proveedores
        Proveedores proveedores = new Proveedores("Xiaomi","7675",Calendar.getInstance().getTime(),Calendar.getInstance().getTime());
        //Factura
        Factura factura = new Factura(2223,Calendar.getInstance().getTime(),9899,"XIAOMI",40);

        


        System.out.println(items);
        System.out.println(solicitud);
        System.out.println(personas);
        System.out.println(Almacen);
        System.out.println(inventario);
    }


}
