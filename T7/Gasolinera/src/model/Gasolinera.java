package model;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;

    private ArrayList<Surtidor> lista;
    private int ganancias;

    public Gasolinera() {
    }

    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    public void agregarSurtidores(Surtidor surtidor){
        this.lista.add(surtidor);
    }

    public int obtenerGanacia(){
        return ganancias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Surtidor> lista) {
        this.lista = lista;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
