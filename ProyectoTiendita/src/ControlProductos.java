
import java.util.ArrayList;
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
