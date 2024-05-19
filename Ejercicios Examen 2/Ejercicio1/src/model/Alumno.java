package model;

public class Alumno {
    private String nombre, apellido, dni;
    private double calificacion;
    private int numeroMatricula;

    public Alumno() {
    }


    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.calificacion = 0;
    }

    public void mostrarDatos(){
        System.out.println("◆ Datos Alumno ◆");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dni: " + dni);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Numero Matricula: " + numeroMatricula);
        System.out.println();
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

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
