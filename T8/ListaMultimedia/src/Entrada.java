import controller.Coleccion;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Coleccion coleccion = new Coleccion();
        do {
            System.out.println("•Indica que función quieres hacer•");
            System.out.println("1. Añadir un elemento: ");
            System.out.println("2. Eliminar un elemento de la colección: ");
            System.out.println("3. Listar elementos: ");
            System.out.println("4. Salir: ");
            System.out.print("Elija una opción 1, 2, 3 o 4: ");
             opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    coleccion.agregarElemento();
                    break;
                case 2:
                    coleccion.borrarElemento(scanner.nextInt());
                    break;
                case 3:
                    coleccion.listarElementos();
                    break;
                case 4:
                    System.out.println("•••••Saliendo•••••");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
            scanner.nextLine();
            System.out.println("Presiona enter para continuar..");
            scanner.nextLine();
        }while (opcion !=4);
        scanner.close();
    }
}
