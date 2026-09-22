
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {
    
    public static final Scanner teclado = new Scanner(System.in);
    
    private List<Producto> listaProductos=new ArrayList();
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    void agregar() {
        System.out.println("Codigo del producto: ");
        int codigo = Integer.parseInt(teclado.nextLine());

        System.out.println("Descripcion del producto: ");
        String descripcion = teclado.nextLine();

        System.out.println("Precio del producto: ");
        float precio = Float.parseFloat(teclado.nextLine());

        listaProductos.add(new Producto(codigo, descripcion, precio));
        System.out.println("Producto agregado a la lista.");
    }

    void ver() {
         System.out.println("CODIGO\tDESCRIPCION\tPRECIO");

    	 for (Producto producto : listaProductos) {
         System.out.println(producto);
    }
}

    void buscar() {
<<<<<<< HEAD
        //Metodo para buscar
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el código del producto a buscar: ");
    int codigoBuscado = sc.nextInt();

    boolean encontrado = false;

    for (Producto p : listaProductos) {
        if (p.getCodigo() == codigoBuscado) {
            System.out.println("Encontrado: " + p);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró ningún producto con ese código.");
    }
}
    
    
=======
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


>>>>>>> 19f8b149f2d269bb2e3cdcdb7bfe141f5601b285
}
