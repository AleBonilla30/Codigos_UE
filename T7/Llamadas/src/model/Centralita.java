package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Centralita {
    private ArrayList<LlamadaLocal> llamadasLocales;
    private ArrayList<LlamadaNacional> llamadasNacionales;
    private int costeAcumulado;

    public Centralita() {
        this.llamadasLocales = new ArrayList<>();
        this.llamadasNacionales = new ArrayList<>();
        this.costeAcumulado = 0;
    }

    public void agregarLocal(LlamadaLocal local){
        this.llamadasLocales.add(local);
        costeAcumulado += local.getCoste();
    }
    public void agregarNacional(LlamadaNacional nacional){
        this.llamadasNacionales.add(nacional);
        costeAcumulado += nacional.costeLlamada();
    }
    public void listarLocales(){
        for (LlamadaLocal local:llamadasLocales) {
            local.mostrarDatos();
        }
    }
    public void listarNacionales(){
        for (LlamadaNacional item:llamadasNacionales) {
            item.mostrarLlamadaNacional();
        }
    }

    public void mostrarCostes(){

        System.out.println("El coste acumulado en la llamada local es: "+costeAcumulado);
    }

    public void menuLlamadas(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

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
                    long num1 = scanner.nextLong();
                    System.out.println("Ingresa el segundo numero: ");
                    long num2 = scanner.nextLong();
                    System.out.println("Ingresa la duracion de llamada");
                    double du = scanner.nextDouble();
                    agregarLocal(new LlamadaLocal(num1,num2,du));
                    System.out.println("Se agrego correctamente");
                    mostrarCostes();
                    listarLocales();

                    break;
                case 2:
                    System.out.println("Ingresa el primer numero: ");
                    long nume1 = scanner.nextLong();
                    System.out.println("Ingresa el segundo numero: ");
                    long nume2 = scanner.nextLong();
                    System.out.println("Ingresa la duracion de llamada");
                    double dura = scanner.nextDouble();
                    System.out.println("Ingrese el destino 1, 2, 3: ");
                     int dest = scanner.nextInt();
                    agregarNacional(new LlamadaNacional(nume1,nume2,dura,dest));
                    mostrarCostes();
                    listarNacionales();
                    break;
                case 3:
                    LlamadaLocal local = new LlamadaLocal(56789765,265753212,5.6);
                    local.mostrarDatos();
                    break;
                case 4:
                    LlamadaNacional nacional = new LlamadaNacional(23456789,456789543,4.6,2);
                    nacional.mostrarLlamadaNacional();
                    break;
                case 5:
                    LlamadaLocal local1 = new LlamadaLocal(56789765,265753212,5.6);
                    LlamadaNacional nacional1 = new LlamadaNacional(23456789,456789543,4.6,2);
                   mostrarCostes();
                    break;
            }

    }
}
