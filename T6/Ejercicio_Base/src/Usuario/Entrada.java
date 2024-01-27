package Usuario;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        String nombre, apellido, dni;
        int edad;
        double altura, peso;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.next();
        System.out.print("Ingrese el apellido: ");
        apellido = scanner.next();
        System.out.print("Ingrese el DNI: ");
        dni = scanner.next();
        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
        System.out.print("Ingrese el peso: ");
        peso = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        Persona p1= new Persona(nombre, apellido, dni,edad,altura,peso);
        Persona p2 = new Persona("Claudia", "Perez");
        Persona p3 = new Persona();
        System.out.println("Dato de la P1:");
        p1.mostrarDato();
        System.out.println("Dato de la P2:");
        p2.mostrarDato();
        System.out.println("Dato de la P3:");
        p3.mostrarDato();

        p1.setEdad(20);
        p2.setEdad(20);
        p3.setEdad(20);
        System.out.println("Los datos actualizados de P1:");
        p1.mostrarDato();
        System.out.println("Los datos actualizados de P2:");
        p2.mostrarDato();
        System.out.println("Los datos actualizados de P3:");
        p3.mostrarDato();
        p1.incrementarEdad(5);
        System.out.println("Los datos actualizados por segunda vez de P1:");
        p1.mostrarDato();

        double imcp1= p1.calcularIMC();
        System.out.println("IMC de P1 es: "+imcp1);

        p1.mostrarEstado(imcp1);


    }


    }

