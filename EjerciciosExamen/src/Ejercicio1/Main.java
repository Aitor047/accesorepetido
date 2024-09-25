package Ejercicio1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Zapatillas", 23.21, false, 'A');
        Producto producto2 = new Producto(2, "Nauticos", 65.90, false,'B');
        Producto producto3 = new Producto(3,"Mocasines", 29.99, false,'C');
        Producto producto4 = new Producto(4,"Alpargatas", 49.99, false,'D');
        Producto producto5 = new Producto(5,"Bambas", 59.99, false,'E');

        List<Producto> listaProducto = List.of(producto1, producto2, producto3, producto4, producto5);

        escribeFicheroBinario("productos.dat", listaProducto);

        leeFicheroBinario("productos.dat");

    }

    private static void leeFicheroBinario(String nombreFichero) {
        try (RandomAccessFile raf = new RandomAccessFile(nombreFichero, "r")){
            int tamañoDeBloque = Integer.BYTES + 10 + Double.BYTES + 1 + Character.BYTES;
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                int id = raf.readInt();
                byte[] nombreBytes = new byte[10];
                raf.readFully(nombreBytes);
                String nombre = new String(nombreBytes).trim();
                double precio = raf.readDouble();
                boolean descuento = raf.readBoolean();
                char tipo = raf.readChar();
                Producto producto = new Producto(id, nombre, precio, descuento, tipo);
                System.out.println(producto);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void escribeFicheroBinario(String nombreFichero, List<Producto> listaProducto) {

        try (RandomAccessFile raf = new RandomAccessFile(nombreFichero, "rw")){
            for (Producto p : listaProducto) {
                raf.writeInt(p.getId());
                raf.writeBytes(String.format("%-10s", p.getNombre()));
                raf.writeDouble(p.getPrecio());
                raf.writeBoolean(p.isDescuento());
                raf.writeChar(p.getTipo());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
