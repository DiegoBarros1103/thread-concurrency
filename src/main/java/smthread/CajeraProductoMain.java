
package smthread;

import domain.ClienteProducto;
import domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Pedro Perez" , productos);
        ClienteProducto cliente2 = new ClienteProducto("Sol Giraldo" , productos);
        ClienteProducto cliente3 = new ClienteProducto("Alan Garcia" , productos);

        long initialTime = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Cajera Betty");
        CajeraProducto cajeraDos = new CajeraProducto("Cajera Marcela");
        CajeraProducto cajeraTres = new CajeraProducto("Cajera Paola");

        cajeraUno.procesarComprar(cliente1, initialTime);
        cajeraDos.procesarComprar(cliente2, initialTime);
        cajeraTres.procesarComprar(cliente3, initialTime);
    }

    private static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto("Tomate" , 500, 6);
        Producto productoDos = new Producto("Cebolla" , 800, 18);
        Producto productoTres = new Producto("Apio" , 500, 46);

        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
    }
}
