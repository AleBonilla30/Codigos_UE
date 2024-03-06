package model;

import java.util.ArrayList;

public class Cuenta {
    private int id;
    public boolean estado;
    private ArrayList<Articulo> listaArticulo;

    public Cuenta() {
    }

    public Cuenta(int id) {
        this.id = id;
        this.listaArticulo = new ArrayList<>();
    }

    public void agregarArticulos(Articulo articulo){
        listaArticulo.add(articulo);
    }

    public int numeroArticulo(){
        System.out.println("La cuenta con id "+id+" tiene "+listaArticulo.size()+" Articulos");
        return listaArticulo.size();
    }
    public double costeTotal(){
        double total = 0.0;
        for ( Articulo articulo: listaArticulo) {
            total += articulo.getCoste();
        }
        System.out.println("El coste total de la cuenta es: "+total);
        return total;
    }
    public void mostrarDatosCuenta(){
        for (Articulo articulo:listaArticulo) {
            articulo.mostrarDatos();
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
