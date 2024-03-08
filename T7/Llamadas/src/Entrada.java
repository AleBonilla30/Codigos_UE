import model.Centralita;
import model.LlamadaLocal;
import model.LlamadaNacional;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Centralita centralita = new Centralita();
        LlamadaLocal local = new LlamadaLocal();
        LlamadaNacional nacional = new LlamadaNacional();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de llamadas:");
            System.out.println("1. Agregar llamada local");
            System.out.println("2. Agregar llamada Nacional");
            System.out.println("3. Mostrar datos de llamada locales");
            System.out.println("4.Mostrar datos de llamadas nacionales");
            System.out.println("5.Mostrar coste acumulado");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el primer numero: ");
                    local.setNumOrigen(scanner.nextLong());
                    System.out.println("Ingresa el segundo numero: ");
                    local.setNumDestino(scanner.nextLong());
                    System.out.println("Ingresa la duracion de llamada");
                    local.setDuracion(scanner.nextDouble());
                    centralita.agregarLocal(new LlamadaLocal(local.getNumOrigen(),local.getNumDestino(),local.getDuracion()));
                    System.out.println("Se agrego correctamente");
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero: ");
                    nacional.setNumeroOrigen(scanner.nextLong());
                    System.out.println("Ingresa el segundo numero: ");
                    nacional.setNumeroDestino(scanner.nextLong());
                    System.out.println("Ingresa la duracion de llamada");
                    nacional.setDuracion(scanner.nextDouble());
                    System.out.println("Ingrese el destino 1, 2, 3: ");
                    nacional.setDestino(scanner.nextInt());
                    centralita.agregarNacional(new LlamadaNacional(nacional.getNumeroOrigen(),nacional.getNumeroDestino(),nacional.getDuracion(),nacional.getDestino()));
                    System.out.println("Se agrego correctamente");
                    break;
                case 3:
                    centralita.listarLocales();
                    break;
                case 4:
                    centralita.listarNacionales();
                    break;
                case 5:
                    centralita.calcularCostesAcumulado();
                    break;
            }
            scanner.nextLine();
            System.out.println("Presiona enter para continuar..");
            scanner.nextLine();
        }while (opcion != 5);
        scanner.close();

    }
}
