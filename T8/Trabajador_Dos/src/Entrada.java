import controler.Empresa;
import model.Asalariado;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcion;
        do {
            System.out.println("Menu lista de trabajadores");
            System.out.println("1. Registrar trabajador:");
            System.out.println("2. Listar:");
            System.out.print("Que quieres hacer: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Registrar Trabajador");
                    System.out.println("1. Registrar jefe:");
                    System.out.println("2. Registrar Autonomo");
                    System.out.println("3. Registrar Asalariado");
                    System.out.print("Que opcion quieres hacer: ");
                    int opcion1 = scanner.nextInt();


                    System.out.println("Introduce el nombre:");
                    String nombre = scanner.next();
                    System.out.println("Introduce el apellido:");
                    String apellido = scanner.next();
                    System.out.println("Introduce el DNI:");
                    String dni = scanner.next();
                    switch (opcion1){
                        case 1:

                            System.out.println("Introduce las Acciones:");
                            int accciones = scanner.nextInt();
                            System.out.println("Introduce el beneficio:");
                            double beneficio = scanner.nextDouble();
                            empresa.registrarTrabajadores(new Jefe(nombre,apellido,dni,accciones,beneficio));
                            break;
                        case 2:

                            System.out.println("Introduce el sueldo:");
                            double sueldo = scanner.nextDouble();
                            System.out.println("Esta contratado:");
                            boolean contratado = scanner.hasNext();
                            empresa.registrarTrabajadores(new Autonomo(nombre,apellido,dni,sueldo,contratado));
                            break;
                        case 3:

                            System.out.println("Introduce el numero de pagas:");
                            int numPagas = scanner.nextInt();
                            System.out.println("Esta contratado:");
                            boolean contratado1 = scanner.hasNext();
                            empresa.registrarTrabajadores(new Asalariado(nombre,apellido,dni,numPagas,contratado1));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Los datos son..");
                    System.out.println("1. Datos Autonomo");
                    System.out.println("2. Datos asalariado");
                    System.out.println("3. Todos los datos");
                    System.out.print("Que quieres hacer: ");
                    int option = scanner.nextInt();
                    System.out.println("Introduce un numero del 1 al 3: ");
                    int one = scanner.nextInt();
                    switch (option){
                        case 1:
                            empresa.listarTrabajadores(one);
                            break;
                        case 2:

                            empresa.listarTrabajadores(one);
                            break;
                        case 3:
                            empresa.listarTrabajadores(one);
                            break;
                    }
                    break;
            }
            scanner.next();
            System.out.println("Presiona enter para continuar");
            scanner.next();
        }while (opcion != 2);
        scanner.close();

    }
}
