package model;

public  abstract class Elemento {
    private int identificador, tamano;
    private String titulo, formato;
    private Persona autor;

    public Elemento() {
    }

    public Elemento(int identificador, int tamano, String titulo, String formato, Persona autor) {
        this.identificador = identificador;
        this.tamano = tamano;
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
    }
    public void mostrarDatos(){
        System.out.println("identificador: " + identificador);
        System.out.println("tamaño: " + tamano);
        System.out.println("titulo: " + titulo);
        System.out.println("formato: " + formato);
        System.out.println("autor: " + autor.getNombre());
    }



    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Persona getAutor(String nombre, String dni) {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
