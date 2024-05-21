package model;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private int precio;
    ArrayList<Ingrediente> listaIngredientes;

    public Pizza() {
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        listaIngredientes = new ArrayList<>();
    }

   public void agregarIngredientes(Ingrediente ingrediente){
        listaIngredientes.add(ingrediente);
        this.precio += ingrediente.getPrecio();
   }
   public void mostrarDatos(){
       System.out.println("Nombre = " + nombre);
       System.out.println("Precio = " + precio);
       System.out.println("Ingredientes:");
       for (Ingrediente ingrediente:listaIngredientes){
           System.out.println("Ingrediente: "+ingrediente.getNombre());
           System.out.println("Precio: "+ingrediente.getPrecio());
       }
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
