
package withthread;

import domain.ClienteProducto;
import domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraThreadProductoPrincipal {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Pedro Perez" , productos);
        ClienteProducto cliente2 = new ClienteProducto("Sol Giraldo" , productos);
        ClienteProducto cliente3 = new ClienteProducto("Alan Garcia" , productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraThreadProducto cajeraUno = new CajeraThreadProducto(" Betty", cliente3, tiempoInicial);
        CajeraThreadProducto cajeraDos = new CajeraThreadProducto(" Mercela", cliente1, tiempoInicial);
        CajeraThreadProducto cajeraTres = new CajeraThreadProducto(" Paola", cliente2, tiempoInicial);

        cajeraUno.start();
        cajeraDos.start();
        cajeraTres.start();
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
