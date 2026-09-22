
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlProductos mControl = new ControlProductos();
<<<<<<< HEAD
        Scanner teclado = ControlProductos.teclado;
=======
        mControl.inicializar();
        Scanner teclado = new Scanner(System.in);
>>>>>>> 19f8b149f2d269bb2e3cdcdb7bfe141f5601b285

        int opcion = 0;
        do {
            System.out.println("Productos");
            System.out.println("1-Agregar");
            System.out.println("2-Ver lista");
            System.out.println("3-Buscar");
            System.out.println("4-Organizar");
            System.out.println("Selecciona la opcion ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> mControl.agregar();
                case 2 -> mControl.ver();
                case 3 -> mControl.buscar();
                case 4 -> mControl.organizar(teclado);

            }
        } while (opcion != 0);
    }

}
