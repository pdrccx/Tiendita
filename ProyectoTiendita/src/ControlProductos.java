
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
    
}
