package tema1;

import java.io.Serializable;
import java.time.LocalDate;

public class Producto implements Serializable {
    private int id;
    private String nombre;
    private double precio;
    private boolean disponible;
    private LocalDate fechaAlta;
    private String categoria;

    // Esto es de la prueba de la segunda pregunta.
    // private transient String informacionAdicional;

    // Esto lo he usado para comprobar lo de objetos no serializables
    // private Scanner sc = new Scanner(System.in);

    public Producto(int id, String nombre, double precio, boolean disponible, LocalDate fechaAlta, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
        this.fechaAlta = fechaAlta;
        this.categoria = categoria;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "tema1.Producto: \n" +
                "\tid: " + this.id + "\n" +
                "\tnombre: " + this.nombre + "\n" +
                "\tprecio: " + this.precio + "\n" +
                "\tdisponible: " + this.disponible + "\n" +
                "\tfechaAlta: " + this.fechaAlta + "\n" +
                "\tcategoria: " + this.categoria + "\n";
    }
}
