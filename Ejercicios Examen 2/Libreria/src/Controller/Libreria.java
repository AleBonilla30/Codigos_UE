package Controller;

import model.Libro;

import java.util.ArrayList;

public class Libreria {
    ArrayList<Libro> listaLibros;
    private int contador;

    public Libreria() {
        this.listaLibros = new ArrayList<>();
        this.contador = 1;
    }
    public void agregarLibros(Libro libro){
        libro.setIsbn(contador++);
        listaLibros.add(libro);
    }
    public void listarLibros(){
        if (listaLibros.isEmpty()){
            System.out.println("No hay libros en la liberias para listar.");
        }else{
            System.out.println("Listando libros...");
            for (Libro libro:listaLibros){
                System.out.println(libro);
            }
        }
    }

    public void aplicarPrecio(int isbn, double precio){
        Libro libro = null;
        for (Libro libroItem:listaLibros){
            if (libroItem.getIsbn()== isbn){
                libro = libroItem;
                break;
            }
        }
        if (libro != null){
            libro.setPrecio(precio);
        }

    }
    public void aplicarDescuento(){
        for (Libro libro:listaLibros){
            libro.calcularDescuento();
            libro.mostrarDatos();
        }
    }
}
