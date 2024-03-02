package model;

public class Asignatura {

    private int identificador;
    private double calificacion;

    public Asignatura() {
    }

    public Asignatura(int identificador){
        this.identificador = identificador;
    }

    public void mostrarDatos(){
        System.out.println("El identificar es: "+identificador);
        System.out.println("La calificacion es: "+calificacion);
    }

    public int getIdentificador(){
       return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

}
