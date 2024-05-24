package model;

public abstract class Libro implements Descuento{
    private int isbn;
    private String titulo;
    private int numPaginas;
    private double precio;



    public Libro() {
    }

    public Libro( String titulo, int numPaginas) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public abstract double calcularDescuento() ;

    @Override
    public abstract void mostrarDatos() ;
}
