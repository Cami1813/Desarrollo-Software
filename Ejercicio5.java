import java.util.Date;

public class Ejercicio5 {
    class Tienda{
        private String nombre;
        private String direccion;
        private String telefono;
        private Producto producto1, producto2, producto3, producto4;
    }

    class Producto{
        private int código;
        private String nombre;
        private String tipo;
        private Date fecha_exp;
        private String fabricante;
        private int cantidad;
        private double precio_unidad;
    }
}
