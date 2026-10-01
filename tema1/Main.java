import tema1.GestionProductos;
import tema1.Producto;

import java.time.LocalDate;

void main() {

    /**
     *
     * ESTO SERIA LA PARTE PRINCIPAL DEL EJERCICIO, LA COMENTO PARA NO INTERFERIR CON EL MENU.
     *
     */

    GestionProductos gp = new GestionProductos();
    gp.agregarProducto(
            new Producto(
                    1,
                    "Raqueta",
                    10.99,
                    false,
                    LocalDate.of(2025, 12, 10),
                    "Deporte"
            )
    );
    gp.agregarProducto(
            new Producto(
                    1,
                    "Raqueta",
                    10.99,
                    false,
                    LocalDate.now(),
                    "Deporte"
            )
    );
    gp.agregarProducto(
            new Producto(
                    1,
                    "Raqueta",
                    10.99,
                    false,
                    LocalDate.of(-10, 10, 10),
                    "Deporte"
            )
    );

    gp.mostrarProductos();

    gp.guardar("productos.dat");

    GestionProductos gp2 = new GestionProductos();

    gp2.cargar("productos.dat");

    gp2.mostrarProductos();
     
/**
    tema1.GestionProductos gp = new tema1.GestionProductos();

    Scanner sc = new Scanner(System.in);

    boolean menu = true;
    while (menu) {
        System.out.println("===== GESTIÓN DE PRODUCTOS =====");
        System.out.println("1. Añadir producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Guardar productos");
        System.out.println("4. Cargar productos");
        System.out.println("5. Salir");

        int option = Integer.parseInt(sc.nextLine());

        switch (option) {
            case 1 -> {
                int id;
                String nombre;
                double precio;
                boolean disponible;
                LocalDate fechaAlta;
                String categoria;

                System.out.println("== Nuevo producto ==");
                System.out.print("Id: ");
                id = Integer.parseInt(sc.nextLine());
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("Precio: ");
                precio = Double.parseDouble(sc.nextLine());
                System.out.print("Disponible: ");
                disponible = Boolean.parseBoolean(sc.nextLine());
                System.out.print("Categoria: ");
                categoria = sc.nextLine();

                gp.agregarProducto(
                        new tema1.Producto(id, nombre, precio, disponible, LocalDate.now(), categoria)
                );

            }
            case 2 -> gp.mostrarProductos();
            case 3 -> gp.guardar("productos.dat");
            case 4 -> gp.cargar("productos.dat");
            default -> menu = false;
        }
    }
 */
}