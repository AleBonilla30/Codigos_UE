package model;

import java.util.Objects;

public class LibroTerror extends Libro {
    private int calificacion;


    public LibroTerror() {
    }

    public LibroTerror(String titulo, int numPaginas, int calificacion) {
        super( titulo, numPaginas);
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "LibroTerror{" +
                "calificacion=" + calificacion +
                "} " + super.toString();
    }

    @Override
    public double calcularDescuento() {
        return  getPrecio()-0.90;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+getTitulo()+", Precio: "+getPrecio()+", con el descuento se queda: "+calcularDescuento());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroTerror that)) return false;
        return calificacion == that.calificacion;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(calificacion);
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
