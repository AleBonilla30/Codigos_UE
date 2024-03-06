package model;

public class Articulo {
    private String nombre;
    private double coste;

    public Articulo() {
    }

    public Articulo(String nombre, double coste) {
        this.nombre = nombre;
        this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("El precio es: "+coste);
    }
}
