package model;



public class Libro extends Elemento  {
    private String ISBN;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int identificador, int tamano, String titulo, String formato, Persona autor, String ISBN, int numPaginas) {
        super(identificador, tamano, titulo, formato, autor);
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Numero de Paginas: " + numPaginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
