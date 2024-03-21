import controller.Coleccion;
import model.*;

import java.util.ArrayList;
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
            System.out.print("Elija una opción: ");
             opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Elemento elemento = null;
                    System.out.println("Que elemento quieres añadir?");
                    System.out.println("1. Libro 📚");
                    System.out.println("2. Video 📹");
                    System.out.println("3. Audio 📻");
                    System.out.println("Elije la opcion: ");
                    int opcionAgregar = scanner.nextInt();
                    System.out.println("Introduce los datos:");
                    System.out.print("Introduce el Identificador: ");
                    int id = scanner.nextInt();
                    System.out.print("Introduce el tamaño: ");
                    int tamano = scanner.nextInt();
                    System.out.print("Introduce el Titulo: ");
                    String titulo = scanner.next();
                    System.out.print("Introduce el Formato: ");
                    String formato = scanner.next();
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce el DNI: ");
                    String dni = scanner.next();
                    switch (opcionAgregar){
                        case 1:
                            System.out.print("Introduce el ISBN del libro: ");
                            String ISBN = scanner.next();
                            System.out.print("Introduce el numero de paginas: ");
                            int numPaginas = scanner.nextInt();
                            Elemento libro = new Libro(id,tamano,titulo,formato,new Persona(nombre,dni),ISBN,numPaginas);

                            break;
                        case 2:

                            String nomDirector = scanner.next();
                            String dniDirector = scanner.next();
                            System.out.print("Introduce el nombre:");
                            String nomActor = scanner.next();
                            System.out.print("Introduce el dni");
                            String dniActor = scanner.next();
                            Elemento video = new Video(id,tamano,titulo,formato,new Persona(nombre,dni),
                                    new Persona(nomDirector,dniDirector),
                                    new Persona[]{new Persona(nomActor,dniActor)});
                            break;
                        case 3:
                            System.out.print("Introduce la duracion: ");
                            double duracion = scanner.nextDouble();
                            System.out.print("Introduce el soporte: ");
                            String soporte = scanner.next();
                            Elemento audio = new Audio(id,tamano,titulo,formato,new Persona(nombre,dni),duracion,soporte);
                            break;
                    }
                    coleccion.agregarElemento(elemento);
                    System.out.println("Agregado correctamente");
                    break;
                case 2:
                    System.out.println("Que identificador quieres borrar?");
                    int idBorrar = scanner.nextInt();
                    coleccion.borrarElemento(idBorrar);
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
