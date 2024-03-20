package model;

import java.util.ArrayList;

public class Video extends Elemento {
    private Persona director;
    private ArrayList<Persona> actores;

    public Video() {
    }

    public Video(int identificador, int tamaño, String titulo, String formato, Persona autor, Persona director) {
        super(identificador, tamaño, titulo, formato, autor);
        this.director = director;
        this.actores = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("director: " + director.getNombre());
        for ( Persona persona: actores) {
            System.out.println("actores: " + persona.getNombre());
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
