package model;

import java.util.Objects;

public class LibroComedia extends Libro {
    private String tipoHumor;

    public LibroComedia() {
    }


    public LibroComedia( String titulo, int numPaginas, String tipoHumor) {
        super( titulo, numPaginas);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public String toString() {
        return "LibroComedia{" +
                "tipoHumor='" + tipoHumor + '\'' +
                "} " + super.toString();
    }

    @Override
    public double calcularDescuento() {
        return getPrecio()-0.85;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+getTitulo()+", Precio: "+getPrecio()+", con el descuento se queda: "+calcularDescuento());

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroComedia that)) return false;
        return Objects.equals(tipoHumor, that.tipoHumor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoHumor);
    }
}
