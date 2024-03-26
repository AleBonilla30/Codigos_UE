package model;

import java.util.Scanner;

public class Trabajador {
    private String nombre, apellido, dni;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public void mostrarDatos(String dni){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dni: ");
        dni = scanner.nextLine();
        System.out.println("Los datos son 📝");
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("dni: " + dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
