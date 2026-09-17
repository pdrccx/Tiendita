
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {
    
    private List<Producto> listaProductos=new ArrayList();
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    void agregar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void ver() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * Organiza la lista de productos segun el criterio que elija el usuario.
     * Se puede ordenar por codigo, descripcion o precio, en orden ascendente
     * o descendente. La lista queda ordenada en memoria, por lo que las demas
     * opciones del menu ya la muestran organizada.
     *
     * Recibe el Scanner de Main en lugar de crear uno propio: dos Scanner
     * sobre System.in se pelean el buffer de entrada y provocan un
     * NoSuchElementException.
     *
     * @param teclado el Scanner que ya usa el menu principal
     */
    void organizar(Scanner teclado) {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos que organizar.");
            return;
        }

        System.out.println("Organizar por:");
        System.out.println("1-Codigo");
        System.out.println("2-Descripcion");
        System.out.println("3-Precio");
        System.out.println("Selecciona el criterio ");
        int criterio = teclado.nextInt();

        Comparator<Producto> comparador = null;
        switch (criterio) {
            case 1 -> comparador = Comparator.comparingInt(Producto::getCodigo);
            case 2 -> comparador = Comparator.comparing(Producto::getDescripcion,
                    String.CASE_INSENSITIVE_ORDER);
            case 3 -> comparador = Comparator.comparingDouble(Producto::getPrecio);
        }

        if (comparador == null) {
            System.out.println("Criterio no valido, la lista no se modifico.");
            return;
        }

        System.out.println("Orden: 1-Ascendente  2-Descendente ");
        int orden = teclado.nextInt();

        if (orden == 2) {
            comparador = comparador.reversed();
        }

        listaProductos.sort(comparador);

        System.out.println("Lista organizada:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }


}
