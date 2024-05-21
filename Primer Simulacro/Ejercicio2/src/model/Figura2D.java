package model;

public abstract class Figura2D implements FiguraGeometrica {
    private String nombre;

    public Figura2D() {
    }

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public abstract void mostrarDatos() ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
