package tema1;

import java.io.*;
import java.util.ArrayList;

public class GestionProductos {
    private ArrayList<Producto> almacen = new ArrayList<>();

    public void agregarProducto(Producto p) {
        almacen.add(p);
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for(Producto p : almacen) {
            System.out.println("\t -" + p.getNombre());
        }
    }

    public void cargar(String archivo) {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(archivo)
            );
            almacen = (ArrayList<Producto>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public void guardar(String archivo) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(archivo)
            );
            out.writeObject(almacen);
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
